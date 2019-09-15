lazy val root = (project in file("."))
  .settings(
    organization := "com.martinbrosenberg",
    name := "ScalaExercises",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.12.10",
    libraryDependencies ++= Seq(
      "com.github.dwickern" %% "scala-nameof" % "1.0.3"  % "provided",
      "org.scalacheck"      %% "scalacheck"   % "1.14.0" % "test",
      "org.scalatest"       %% "scalatest"    % "3.0.8"  % "test",
    ),
  )
