addSbtPlugin("com.geirsson"      % "sbt-ci-release"        % "1.5.5")
addSbtPlugin("com.dwijnand"      % "sbt-travisci"          % "1.2.0")
addSbtPlugin("org.scalameta"     % "sbt-scalafmt"          % "2.4.2")
addSbtPlugin("de.heikoseeberger" % "sbt-header"            % "5.6.0")
addSbtPlugin("org.wartremover"   % "sbt-wartremover"       % "2.4.13")
addSbtPlugin("ch.epfl.scala"     % "sbt-scalafix"          % "0.9.24")
addSbtPlugin("org.scalastyle"   %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("net.virtual-void"  % "sbt-dependency-graph"  % "0.9.2")
addSbtPlugin("net.vonbuchholtz"  % "sbt-dependency-check"  % "3.1.1")
addSbtPlugin("com.eed3si9n"      % "sbt-buildinfo"         % "0.10.0")
addSbtPlugin("org.scoverage"     % "sbt-scoverage"         % "1.6.1")

libraryDependencies += "org.slf4j" % "slf4j-nop" % "1.7.30" // Needed by sbt-git
