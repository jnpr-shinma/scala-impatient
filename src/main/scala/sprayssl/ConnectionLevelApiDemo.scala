package sprayssl

import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.{SSLContext, TrustManager, X509TrustManager}

import akka.actor._
import akka.io.IO
import akka.pattern.ask
import akka.util.Timeout
import spray.can.Http
import spray.http.HttpMethods._
import spray.http._
import spray.io.ClientSSLEngineProvider

import scala.concurrent.Future
import scala.concurrent.duration._

trait ConnectionLevelApiDemo {
  private implicit val timeout: Timeout = 5.seconds

  def demoConnectionLevelApi(host: String)(implicit system: ActorSystem, sslEngineProvider: ClientSSLEngineProvider): Future[String] = {
    val actor = system.actorOf(Props(new MyRequestActor(host)), name = "my-request-actor")
    val future = actor ? HttpRequest(GET, "/")
    future.mapTo[String]
  }

  // The connection-level API is the lowest-level way to access the spray-can client-side infrastructure.
  // With it you are in charge of establishing, using, and tearing down the HTTP connections yourself.
  // The benefit is that you have complete control over when connections are being established and torn down
  // as well as how requests are scheduled onto them.

  // Actor that manages the lifecycle of a single HTTP connection for a single request
  class MyRequestActor(host: String) extends Actor with ActorLogging {

    import context.system

    def receive: Receive = {
      case request: HttpRequest =>
        // start by establishing a new HTTP connection
        implicit val sslContext = {
          /** Create a trust manager that does not validate certificate chains. */
          val permissiveTrustManager: TrustManager = new X509TrustManager() {
            override def checkClientTrusted(chain: Array[X509Certificate], authType: String): Unit = {
            }

            override def checkServerTrusted(chain: Array[X509Certificate], authType: String): Unit = {
            }

            override def getAcceptedIssuers(): Array[X509Certificate] = {
              null
            }
          }

          val initTrustManagers = Array(permissiveTrustManager)
          val ctx = SSLContext.getInstance("TLS")
          ctx.init(null, initTrustManagers, new SecureRandom())
          ctx
        }
        IO(Http) ! Http.Connect(host, port = 5905, sslEncryption = true)
        context.become(connecting(sender, request))
    }

    def connecting(commander: ActorRef, request: HttpRequest): Receive = {
      case _: Http.Connected =>
        // once connected, we can send the request across the connection
        sender ! request
        context.become(waitingForResponse(commander))

      case Http.CommandFailed(Http.Connect(address, _, _, _, _)) =>
        log.warning("Could not connect to {}", address)
        commander ! Status.Failure(new RuntimeException("Connection error"))
        context.stop(self)
    }

    def waitingForResponse(commander: ActorRef): Receive = {
      case response@HttpResponse(status, entity, _, _) =>
        log.info("Connection-Level API: received {} response with {} bytes", status, entity.data.length)
        sender ! Http.Close
        context.become(waitingForClose(commander, response))

      case ev@(Http.SendFailed(_) | Timedout(_)) =>
        log.warning("Received {}", ev)
        commander ! Status.Failure(new RuntimeException("Request error"))
        context.stop(self)
    }

    def waitingForClose(commander: ActorRef, response: HttpResponse): Receive = {
      case ev: Http.ConnectionClosed =>
        log.debug("Connection closed ({})", ev)
        commander ! Status.Success(response.entity.data.asString)
        context.stop(self)

      case Http.CommandFailed(Http.Close) =>
        log.warning("Could not close connection")
        commander ! Status.Failure(new RuntimeException("Connection close error"))
        context.stop(self)
    }
  }

}
