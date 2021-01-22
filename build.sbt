lazy val root = (project in file("."))
  .settings(
    organization := "com.martinbrosenberg",
    name := "ScalaExercises",
    version := "0.0.1-SNAPSHOT",
    scalaVersion := "2.13.4",
    libraryDependencies ++= Seq(
      "com.github.dwickern" %% "scala-nameof" % "2.0.0"  % "provided",
      "org.scalacheck"      %% "scalacheck"   % "1.15.2" % "test",
      "org.scalatest"       %% "scalatest"    % "3.2.3"  % "test",
    ),
  )
