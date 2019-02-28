lazy val root = (project in file("."))
  .settings(
    organization := "com.martinbrosenberg",
    name := "ScalaProblems",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    ),
  )
