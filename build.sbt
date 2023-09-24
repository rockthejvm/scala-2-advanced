
lazy val root = project
  .in(file("."))
  .settings(
    name := "scala-2-advanced",
    version := "0.1.0",
    scalaVersion := "2.13.5",
    libraryDependencies ++= Seq(
      "com.novocode" % "junit-interface" % "0.11" % "test",
      "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4",
    )
  )
