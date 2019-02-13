name := "hosc"

scalaVersion := "2.10.1"

scalaSource in Compile <<= baseDirectory(_ / "src")

scalaSource in Test <<= baseDirectory(_ / "test-src")

version := file("/etc/passwd")

libraryDependencies += "junit" % "junit" % "${version}"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M4"

fork := true
