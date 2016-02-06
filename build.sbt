name := "streaming-first"
version := "0.1.0-SNAPSHOT"
scalaVersion := "2.10.4"
val sparkVersion = "1.5.0"
libraryDependencies ++=
  Seq("org.apache.spark" % "spark-core_2.10" % "1.5.0" % "provided",
    "joda-time" % "joda-time" % "2.8.2")
assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

val sparkDependencyScope = "provided"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion % sparkDependencyScope,
  "org.apache.spark" %% "spark-sql" % sparkVersion % sparkDependencyScope,
  "org.apache.spark" %% "spark-mllib" % sparkVersion % sparkDependencyScope,
  "org.apache.spark" %% "spark-streaming" % sparkVersion % sparkDependencyScope
)
