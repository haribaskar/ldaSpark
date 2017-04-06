

name := "lda-spark"

version := "1.0"

scalaVersion :=  "2.11.6"
val sparkVersion = "2.1.0"

libraryDependencies += "org.apache.spark" % "spark-core_2.11" % "2.1.0"

libraryDependencies += "org.apache.spark" % "spark-sql_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-mllib_2.11" % "2.1.0"
libraryDependencies += "org.apache.spark" % "spark-graphx_2.11" % "2.1.0"
libraryDependencies += "com.github.scopt" %% "scopt" % "3.2.0"