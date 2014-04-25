name := "ScalaSCAPlugin"

version := "0.1"

scalaVersion := "2.11.0"

mainClass in (Compile, run) := Some("ScalaSCAPlugin")

libraryDependencies ++= Seq(
	"org.scala-lang" % "scala-library-all" % "2.11.0",
	"org.scala-lang" % "scala-reflect" % "2.11.0",
	"org.scala-lang" % "scala-compiler" % "2.11.0",
	"lara.epfl" % "scalasca_2.11" % "0.1"
)

lazy val buildSettings = Seq(
	version := "0.1-SNAPSHOT",
	scalaVersion := "2.11.0"
)

fork := true