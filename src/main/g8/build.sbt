// build.sbt

name := "$name$"

version := "0.1-SNAPSHOT"

scalacOptions ++= Seq(
  "-unchecked", "-deprecation", "-feature", "-language:higherKinds",
  "-language:implicitConversions", "-Ykind-projector:underscores"
)

enablePlugins(ScalaNativePlugin)

enablePlugins(MdocPlugin)

import scala.scalanative.build.*

libraryDependencies  ++= Seq(
  "com.github.scopt" %%% "scopt" % "4.1.0",
  //"org.typelevel" %%% "spire" % "0.18.0",
  "org.typelevel" %%% "cats-core" % "2.12.0"
)

resolvers ++= Seq(
  "Sonatype Snapshots" at
    "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at
    "https://oss.sonatype.org/content/repositories/releases/"
)

scalaVersion := "3.3.3"


// eof

