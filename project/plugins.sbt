logLevel := Level.Warn

addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.5.2")

addSbtPlugin("io.spray" % "sbt-revolver" % "0.7.2")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "0.99.7.1")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.4.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.7.4")

resolvers += Resolver.url(
  "SCP Maven Repo",
  url("http://10.155.87.253:8081/nexus/content/groups/scp-repo"))(Resolver.ivyStylePatterns)

addSbtPlugin("net.juniper" % "yang-plugin" % "0.8.7")
