import sbt._

class LsugDojo3Group1(info: ProjectInfo) extends DefaultProject(info) {
  val scalatest = "org.scalatest" % "scalatest" % "1.2"
  val scalacheck = "org.scala-tools.testing" % "scalacheck_2.8.1" % "1.8"
}