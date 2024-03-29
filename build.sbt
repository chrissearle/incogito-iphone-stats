organization := "net.chrissearle"

name := "jzstats"

version := "1.0-SNAPSHOT"

scalaVersion := "2.9.0-1"

seq(webSettings :_*)

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % "2.0.0.RC1",
  "org.scalatra" %% "scalatra-scalate" % "2.0.0.RC1",
  "org.eclipse.jetty" % "jetty-webapp" % "7.4.5.v20110725" % "jetty",
  "javax.servlet" % "servlet-api" % "2.5" % "provided",
  "com.mongodb.casbah" %% "casbah" % "2.1.5.0"
)

resolvers += "Sonatype OSS Snapshots" at "http://oss.sonatype.org/content/repositories/snapshots/"
