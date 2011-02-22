import sbt._

class RomanProject(info: ProjectInfo) extends DefaultProject(info) {
  // repositories to use
  val scalaToolsReleases = ScalaToolsReleases

  // dependencies
  val scalatest = "org.scalatest" % "scalatest" % "1.2" % "test"
}
