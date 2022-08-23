lazy val root = (project in file("."))
  .settings(
    organization := "com.martinbrosenberg",
    name := "ScalaExercises",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      "com.github.dwickern" %% "scala-nameof" % "4.0.0"  % "provided",
      "org.scalacheck"      %% "scalacheck"   % "1.16.0" % "test",
      "org.scalatest"       %% "scalatest"    % "3.2.13" % "test",
    ),
    testFrameworks += TestFrameworks.ScalaTest
  )
