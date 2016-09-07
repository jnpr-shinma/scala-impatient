package sprayssl

/**
  * Created by shinma on 9/2/16.
  */
//class Test {
//
//}
//object Test extends App {
//  IO(Http) ! Http.Connect("www.spray.io", port = 8080)
//}


//val response: Future[HttpResponse] =
//  (IO(Http) ? HttpRequest(GET, Uri("http://spray.io"))).mapTo[HttpResponse]

// or, with making use of spray-httpx

//val response2: Future[HttpResponse] =
//  (IO(Http) ? Get("http://spray.io")).mapTo[HttpResponse]

//object Test extends App {
//  implicit val system: ActorSystem = ActorSystem()
//  implicit val timeout: Timeout = Timeout(15.seconds)
//  import system.dispatcher // implicit execution context
//  (IO(Http) ? HttpRequest(GET, Uri("http://spray.io"))).mapTo[HttpResponse]
//}


///**
//  * Created by shinma on 9/2/16.
//  */
//class Test {
//
//}
//
//import java.security.SecureRandom
//import java.security.cert.X509Certificate
//import javax.net.ssl.{SSLContext, X509TrustManager, TrustManager}
//
//import akka.actor.ActorRef
//import akka.io.IO
//import akka.util.Timeout
//import spray.can.Http
//
//import scala.concurrent.Future
//
//trait HttpClient {
//  /** For the HostConnectorSetup ask operation. */
//  implicit val ImplicitPoolSetupTimeout: Timeout = 30
//
//  val hostName: String
//  val hostPort: Int
//
//  implicit val sslContext = {
//    /** Create a trust manager that does not validate certificate chains. */
//    val permissiveTrustManager: TrustManager = new X509TrustManager() {
//      override def checkClientTrusted(chain: Array[X509Certificate], authType: String): Unit = {
//      }
//      override def checkServerTrusted(chain: Array[X509Certificate], authType: String): Unit = {
//      }
//      override def getAcceptedIssuers(): Array[X509Certificate] = {
//        null
//      }
//    }
//
//    val initTrustManagers = Array(permissiveTrustManager)
//    val ctx = SSLContext.getInstance("TLS")
//    ctx.init(null, initTrustManagers, new SecureRandom())
//    ctx
//  }
//
//  def initClientPool(): Future[ActorRef] = {
//    val hostPoolFuture = for {
//      Http.HostConnectorInfo(connector, _) <- IO(Http) ? Http.HostConnectorSetup(hostName, port = hostPort,
//        sslEncryption = true)
//    } yield connector
//  }
//}


//import akka.actor.ActorSystem
//import akka.actor.Status.{Failure, Success}
//import akka.event.Logging
//import akka.io.IO
import akka.util.Timeout
import spray.can.Http.{HostConnectorInfo, HostConnectorSetup}
import spray.http.HttpRequest
import spray.json.JsObject

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

/**
  * Created by shinma on 5/18/16.
  */
object Testasdf extends App {
  //  val emsCentralBaseUrl = EasyRestEnvironment.getConfig("easy-rest.ems-central.url")

  //  var pipeline: HttpRequest => Future[HttpResponse] = _

  //  implicit val sslContext = {
  //    /** Create a trust manager that does not validate certificate chains. */
  //    val permissiveTrustManager: TrustManager = new X509TrustManager() {
  //      override def checkClientTrusted(chain: Array[X509Certificate], authType: String): Unit = {
  //      }
  //
  //      override def checkServerTrusted(chain: Array[X509Certificate], authType: String): Unit = {
  //      }
  //
  //      override def getAcceptedIssuers(): Array[X509Certificate] = {
  //        null
  //      }
  //    }
  //
  //    val initTrustManagers = Array(permissiveTrustManager)
  //    val ctx = SSLContext.getInstance("TLS")
  //    ctx.init(null, initTrustManagers, new SecureRandom())
  //    ctx
  //  }
  implicit val system = ActorSystem()
  import system.dispatcher // execution context for futures below

  import spray.json._


  print("-------------")
  val pipeline: HttpRequest => Future[HttpResponse] = sendReceive

  getAllConfigTemplate("")

  def getAllConfigTemplate(token: String): Future[JsObject] = {
    //    addToken(token)
    val url = "http://10.208.135.125/"
    //    val url = "https://10.208.135.125:5905/"
    pipeline(Get(url)) map {
      resp =>
        if (resp.status.isSuccess) {
          resp.entity.asString.parseJson.asJsObject
        } else {
          throw new RuntimeException("Failed to call " + url + ", status:" + resp.status)
        }
    }
  }

  //  def addToken(token: String): Unit = {
  //    pipeline = addHeader("X-Auth-Token", token) ~> sendReceive
  //  }
}