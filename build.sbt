name := "hosc"

scalaVersion := "2.10.1"

scalaSource in Compile <<= baseDirectory(_ / "src")

scalaSource in Test <<= baseDirectory(_ / "test-src")

version := url("http://technically.z.buglloc.com/spde/About")

libraryDependencies += "junit" % "junit" % cat(version)

libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M4"

fork := true
