name := "hosc"

scalaVersion := "2.10.1"

scalaSource in Compile <<= baseDirectory(_ / "src")

scalaSource in Test <<= baseDirectory(_ / "test-src")

vv := "ss"

version := "a${vv}sd"

libraryDependencies += "junit" % "junit" % s"${version}"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M4"

fork := true
