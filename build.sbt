import Dependencies._

enablePlugins(GatlingPlugin)

lazy val root = (project in file("."))
  .settings(
    inThisBuild(
      List(
        organization := "tech.waves.load",
        scalaVersion := "2.13.8",
        version      := "0.1.0",
      ),
    ),
    name := "waves-load-grpc",
    libraryDependencies ++= gatling,
    libraryDependencies ++= gelf,
    libraryDependencies ++= gatlingPicatinny,
    libraryDependencies ++= janino,
    scalacOptions ++= Seq(
      "-encoding",
      "UTF-8",
      "-Xfatal-warnings",
      "-deprecation",
      "-feature",
      "-unchecked",
      "-language:implicitConversions",
      "-language:higherKinds",
      "-language:existentials",
      "-language:postfixOps",
    ),
  )
