scalaVersion := "2.11.7"

name         := "duck"
version      := "0.0.1-SNAPSHOT"
organization := "com.github.dvarelap"
// source/resources configuration
scalaSource in Compile       := baseDirectory.value / "app"
scalaSource in Test          := baseDirectory.value / "specs"
resourceDirectory in Compile := baseDirectory.value / "config"
resourceDirectory in Test    := baseDirectory.value / "specs-config"
