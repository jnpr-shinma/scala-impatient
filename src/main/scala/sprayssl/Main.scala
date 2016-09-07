package sprayssl

import java.security.SecureRandom
import java.security.cert.X509Certificate
import javax.net.ssl.{SSLContext, TrustManager, X509TrustManager}

import akka.actor.ActorSystem
import akka.event.Logging

import scala.util.{Failure, Success}

object Main extends App
  with ConnectionLevelApiDemo
  with HostLevelApiDemo
  with RequestLevelApiDemo {
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
  import spray.io.ClientSSLEngineProvider

  //  implicit val myEngineProvider = ClientSSLEngineProvider { engine =>
  //    engine.setEnabledCipherSuites(Array("TLS_RSA_WITH_AES_256_CBC_SHA"))
  //    engine.setEnabledProtocols(Array("SSLv3", "TLSv1"))
  //    engine
  //  }

  // we always need an ActorSystem to host our application in
  implicit val system = ActorSystem("simple-example")
  import system.dispatcher // execution context for future transformations below
  val log = Logging(system, getClass)

  // the spray-can client-side API has three levels (from lowest to highest):
  // 1. the connection-level API
  // 2. the host-level API
  // 3. the request-level API
  //
  // this example demonstrates all three APIs by retrieving the server-version
  // of http://spray.io in three different ways

  val host = "10.208.135.125"
  //  val host="spray.io"

  val result = for {
  //    result1 <- demoConnectionLevelApi(host)
    result2 <- demoHostLevelApi(host)
  //    result3 <- demoRequestLevelApi(host)
  //  } yield Set(result1, result2, result3)
  //  } yield Set(result1,result2)
  } yield Set(result2)
  //  } yield Set(result1)
  //  } yield Set(result3)

  result onComplete {
    case Success(res) => log.info("{} is running {}", host, res mkString ", ")
    case Failure(error) => log.warning("Error: {}", error)
  }
  result onComplete { _ => system.shutdown() }
}
