organization := "com.nexelem.orient"

name := "wakizashi"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions", "-Xfatal-warnings")

resolvers ++= Seq(
    "typesafe repo" at "http://repo.typesafe.com/typesafe/releases/"
)

libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-reflect" % scalaVersion.value,
    "org.slf4j" % "slf4j-api" % "1.7.6",
    "com.orientechnologies" % "orientdb-graphdb" % "2.1-rc1",
    "junit" % "junit" % "4.12" % "test",
    "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
