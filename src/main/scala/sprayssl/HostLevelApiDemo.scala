package sprayssl

//import java.security.SecureRandom
//import java.security.cert.X509Certificate
//import javax.net.ssl.{SSLContext, TrustManager, X509TrustManager}
//
//import akka.actor.{ActorRefFactory, ActorSystem}
//import akka.io.IO
//import akka.pattern.ask
//import akka.util.Timeout
//import spray.can.Http
//import spray.http.HttpMethods._
//import spray.http._
//import spray.io.ClientSSLEngineProvider
//
//import scala.concurrent.Future
//import scala.concurrent.duration._
//
//trait HostLevelApiDemo {
//  private implicit val timeout: Timeout = 5.seconds
//
//  // With the host-level API you ask the spray-can HTTP infrastructure to setup an
//  // "HttpHostConnector" for you, which is an entity that manages a pool of connection to
//  // one particular host. Once set up you can send the host connector HttpRequest instances,
//  // which it will schedule across a connection from its pool (according to its configuration)
//  // and deliver the responses back to the request sender
//  def demoHostLevelApi(host: String)(implicit system: ActorSystem, sslEngineProvider: ClientSSLEngineProvider): Future[String] = {
//    import system.dispatcher // execution context for future transformations below
//    for {
//      Http.HostConnectorInfo(hostConnector, _) <- IO(Http) ? Http.HostConnectorSetup(host, port = 5905, sslEncryption=true)
//      response <- hostConnector.ask(HttpRequest(GET, "/")).mapTo[HttpResponse]
//    } yield {
//      system.log.info("Host-Level API: received {} response with {} bytes",
//        response.status, response.entity.data.length)
////      response.header[HttpHeaders.Server].get.products.head
//      response.entity.data.asString
//    }
//  }
//
//}
//
import akka.util.Timeout
import spray.io.ClientSSLEngineProvider
import scala.concurrent.Future
import spray.client.pipelining._
import akka.actor.ActorSystem
import akka.pattern.ask
import scala.concurrent.duration._
import akka.io.IO
import spray.can.Http
import spray.util._

trait HostLevelApiDemo {
  private implicit val timeout: Timeout = 5.seconds

  // With the host-level API you ask the spray-can HTTP infrastructure to setup an
  // "HttpHostConnector" for you, which is an entity that manages a pool of connection to
  // one particular host. Once set up you can send the host connector HttpRequest instances,
  // which it will schedule across a connection from its pool (according to its configuration)
  // and deliver the responses back to the request sender
  def demoHostLevelApi(host: String)(implicit system: ActorSystem, sslEngineProvider: ClientSSLEngineProvider): Future[String] = { // execution context for future transformations below
    import system.dispatcher
    for {
      Http.HostConnectorInfo(hostConnector, _) <- IO(Http) ? Http.HostConnectorSetup(host, port = 5905, sslEncryption=true)
//      response <- hostConnector.ask(HttpRequest(GET, "/")).mapTo[HttpResponse]
      url = "/"
      response <- sendReceive(hostConnector).apply(Get(url))
      _ <- hostConnector ? Http.CloseAll
//      val responseFut: Future[HttpResponse] = for {
//        HostConnectorInfo(hostConnector, _) <- IO(Http) ? HostConnectorSetup(host, port = port, sslEncryption = true)
//        response <- sendReceive(hostConnector).apply(Get(url))
//        _ <- hostConnector ? Http.CloseAll
//      } yield response


    } yield {
      system.log.info("Host-Level API: received {} response with {} bytes",
        response.status, response.entity.data.length)
      //      response.header[HttpHeaders.Server].get.products.head
      response.entity.data.asString
    }
  }

}