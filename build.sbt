name := "bintray-update-checker"

organization := "com.hanhuy.sbt"

version := "0.1"

scalacOptions ++= Seq("-deprecation","-Xlint","-feature")

libraryDependencies += "io.argonaut" %% "argonaut" % "6.1"

// publishing settings
publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

pomIncludeRepository := { _ => false }

pomExtra :=
  <scm>
    <url>git@github.com:pfn/bintray-update-checker.git</url>
    <connection>scm:git:git@github.com:pfn/bintray-update-checker.git</connection>
  </scm>
  <developers>
    <developer>
      <id>pfnguyen</id>
      <name>Perry Nguyen</name>
      <url>https://github.com/pfn</url>
    </developer>
  </developers>

homepage := Some(url("https://github.com/pfn/bintray-update-checker"))

publishMavenStyle := true

licenses += ("MIT", url("http://opensource.org/licenses/MIT"))