package sprayssl

import akka.event.Logging
import scala.util.{Failure, Success}
import spray.client.pipelining._
import akka.actor.ActorSystem
import akka.pattern.ask
import scala.concurrent.duration._
import akka.io.IO
import spray.can.Http
import spray.util._


object Main11 extends App {
  implicit val system = ActorSystem("simple-spray-client") // execution context for futures below
  import system.dispatcher // execution context for futures below

  val log = Logging(system, getClass)
  val pipeline = sendReceive
//  implicit val myEngineProvider = ClientSSLEngineProvider { engine =>
//    engine.setEnabledCipherSuites(Array("TLS_RSA_WITH_AES_256_CBC_SHA"))
//    engine.setEnabledProtocols(Array("SSLv3", "TLSv1"))
//    engine
//  }
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

//    val initTrustManagers = Array(permissiveTrustManager)
//    val ctx = SSLContext.getInstance("TLS")
//    ctx.init(null, initTrustManagers, new SecureRandom())
//    ctx
//  }
  val responseFuture = pipeline {
    val url="https://www.googleapis.com/youtube/v3/channels?part=contentDetails&mine=true"
//    val url="https://10.208.135.125:5905"
//    Get("http://maps.googleapis.com/maps/api/elevation/json?locations=27.988056,86.925278&sensor=false")
    Get(url)
  }
  responseFuture onComplete {
    case Success(resp) => {
      log.info("Request Success {}", resp.headers)
      log.info("Response {}", resp.entity)
      shutdown()
    }
    case Failure(error) =>
      log.error(error, "Failure")
      shutdown()
  }

  def shutdown(): Unit = {
    IO(Http).ask(Http.CloseAll)(1.second).await
    system.shutdown()
  }
}
