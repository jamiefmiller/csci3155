name := "My test Scala project"

version := "1.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
    "org.scalatest" %% "scalatest" % "1.9.1" % "test" withSources() withJavadoc()
)
