lazy val sbtIndigoVersion = "0.0.12-SNAPSHOT"

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.6.1")
// addSbtPlugin("org.portable-scala" % "sbt-scala-native-crossproject" % "0.6.0") // NO 2.12 support :-(
addSbtPlugin("org.scala-js"       % "sbt-scalajs"                   % "0.6.31")
// addSbtPlugin("org.scala-native"   % "sbt-scala-native"              % "0.3.8") // NO 2.12 support :-(
addSbtPlugin("indigo" % "sbt-indigo" % sbtIndigoVersion)
addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.4.3")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")
