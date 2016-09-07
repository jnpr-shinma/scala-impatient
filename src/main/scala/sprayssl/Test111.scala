package sprayssl

//import akka.actor.ActorSystem
//import akka.actor.Status.{Failure, Success}
//import akka.event.Logging
//import akka.io.IO
import akka.util.Timeout
import spray.can.Http.{HostConnectorInfo, HostConnectorSetup}

//import spray.can.Http
//import spray.can.Http.{HostConnectorInfo, HostConnectorSetup}
import spray.http.HttpResponse

//
import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.{SSLContext, TrustManager, X509TrustManager}

import akka.actor.ActorSystem
import akka.event.Logging
import akka.io.IO
import akka.pattern.ask
import spray.can.Http
import spray.client.pipelining._

import scala.concurrent.Future
import scala.concurrent.duration._
import scala.util.{Failure, Success}

object ImpressionGenerator extends App {
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
  implicit val system = ActorSystem()
  import system.dispatcher // execution context for futures below

  private implicit val timeout: Timeout = 5.seconds

  val log = Logging(system, getClass)
  val host = "10.208.135.125"
  val port = 5905
  //8443
  //  val gen = new PixelGenerator()
  val url = "https://10.208.135.125:5905"
  val responseFut: Future[HttpResponse] = for {
    HostConnectorInfo(hostConnector, _) <- IO(Http) ? HostConnectorSetup(host, port = port, sslEncryption = true)
    response <- sendReceive(hostConnector).apply(Get(url))
    _ <- hostConnector ? Http.CloseAll
  } yield response


  responseFut onComplete {
    case Success(HttpResponse(st, _, _, _)) =>
      log.info("Successfully executed impression pixel call.  Status: " + st)
//      st.entity.data.asString

      shutdown()

    case Failure(err) =>
      log.error(err, "Error completing request: " + err.getMessage)
      shutdown()
  }

  def shutdown() {
    system.shutdown()
  }
}