name := "SampleProject"

version := "0.1.0"

scalaVersion := "2.13.6"

resolvers += "jitpack" at "https://jitpack.io"

resolvers += "GitHub pschaus/oscar Maven repo" at "https://maven.pkg.github.com/pschaus/oscar"


// Adding a library dependency for ScalaTest
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.9" % Test
)

// Adding a library dependency for ScalaTest

libraryDependencies += "oscar" %% "oscar-cp" % "5.0.0"


// Some common options for the Scala compiler
scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature"
)