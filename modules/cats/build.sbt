import Dependencies.Version._
import Utilities._

name := "pureconfig-cats"

crossScalaVersions := Seq(scala212, scala213, scala30, scala31)

libraryDependencies ++= Seq(
  "org.typelevel" %% "cats-core" % "2.6.1",
  "org.typelevel" %% "cats-laws" % "2.6.1" % "test",
  "org.typelevel" %% "discipline-scalatest" % "2.1.5" % "test"
)

developers := List(
  Developer("derekmorr", "Derek Morr", "morr.derek@gmail.com", url("https://github.com/derekmorr")),
  Developer("ruippeixotog", "Rui Gonçalves", "ruippeixotog@gmail.com", url("https://github.com/ruippeixotog"))
)
