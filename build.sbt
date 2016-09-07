name := "scala-impatient"

version := "1.0"

scalaVersion := "2.11.4"


libraryDependencies ++= {
  Seq(
    "io.spray" %% "spray-can" % "1.3.2" withSources(),
    "io.spray" %% "spray-routing" % "1.3.2" withSources(),
    "io.spray" %% "spray-client" % "1.3.2" withSources(),
    "io.spray" %% "spray-testkit" % "1.3.2" % "test" withSources(),
    "com.google.guava" % "guava" % "18.0" withSources(),
    "com.typesafe.akka" %% "akka-actor" % "2.3.7" withSources(),
    "com.typesafe.akka" %% "akka-testkit" % "2.3.7" % "test" withSources(),
    "io.spray" %% "spray-json" % "1.3.1",
    "com.thinkaurelius.titan" % "titan-core" % "0.5.4",
    "com.thinkaurelius.titan" % "titan-cassandra" % "0.5.4",
    "com.thinkaurelius.titan" % "titan-es" % "0.5.4",
    "com.thinkaurelius.titan" % "titan-berkeleyje" % "0.5.4",
    "org.elasticsearch" % "elasticsearch" % "1.5.0" % "test" withSources(),
    "com.woorea" % "keystone-client" % "3.2.2-alpha.1",
    "com.woorea" % "resteasy-connector" % "3.2.2-alpha.1",
    "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
    "ch.ethz.ganymed" % "ganymed-ssh2" % "262",
    "junit" % "junit" % "4.11",
    "org.hamcrest" % "hamcrest-core" % "1.3",
    "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4",
    "org.mybatis" % "mybatis" % "3.2.7",
    "mysql" % "mysql-connector-java" % "5.1.33"
  )
}

resolvers += "Local Maven Repository" at Path.userHome.asFile.toURI.toURL + "/.m2/repository/"

