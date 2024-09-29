name := "SampleProject"

version := "0.1.0"

scalaVersion := "2.13.11"

resolvers += "jitpack" at "https://jitpack.io"


// Adding a library dependency for ScalaTest
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % Test
)

libraryDependencies += "com.github.pschaus" % "oscar" % "ac930fe9d8"



// Some common options for the Scala compiler
scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)