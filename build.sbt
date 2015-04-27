name := "scala-impatient"

version := "1.0"

scalaVersion := "2.11.4"

libraryDependencies ++= {
  Seq(
    "com.thinkaurelius.titan" % "titan-all" % "0.5.4",
    "com.woorea"  %	"keystone-client"	 % "3.2.2-alpha.1",
    "com.woorea"  %	"resteasy-connector"	 % "3.2.2-alpha.1",
    "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test",
    "ch.ethz.ganymed" % "ganymed-ssh2" % "262",
    "junit" % "junit" % "4.11",
    "org.hamcrest" % "hamcrest-core" % "1.3",
    "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4",
    "org.mybatis"         % "mybatis"         % "3.2.7",
    "mysql"               % "mysql-connector-java" % "5.1.33",
    "org.opendaylight.yangtools" % "yang-model-api" % "0.6.2-Helium",
    "org.opendaylight.yangtools" % "yang-parser-impl" % "0.6.2-Helium",
    "org.opendaylight.yangtools" % "yang-parser-api" % "0.6.2-Helium"
  )
}