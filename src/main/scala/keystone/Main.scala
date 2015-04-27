package keystone


object Main extends App {
//  implicit val system = ActorSystem("simple-spray-client")
//  val pipeline =  (addHeader("X-Auth-Token","netscreen")~> sendReceive)
//
//  val url="http://10.208.3.144:5000/v3/projects/ed1e533d6bcb4f9ca7d9b9a65ae1049a/users/d62eb637fb7445958f43cb6a5458631e/roles/60b6e5709db34341a92aa6268146e8df"
//
//  val responseFuture = pipeline {
//    Put(url)
//  }
//
////  val answer = Await.result(responseFuture, 1 second)
//    responseFuture onComplete {
//
//
//    case Success(somethingUnexpected) =>
//      println(somethingUnexpected)
//       shutdown()
//
//    case Failure(error) =>
//        shutdown()
//  }
//
//  def shutdown(): Unit = {
//    IO(Http).ask(Http.CloseAll)(1.second).await
//    system.shutdown()
//  }

  //  while (true){
  //    val u=new EsmUserService
  //    u.notify(new UpdateUser({
  //      val u=new User
  //      u.setPassword("ddd")
  //      u.setName("test1")
  //      u
  //    }))
  //    Thread.sleep(1000)
  //  }
}
