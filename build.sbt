name := "ShareApp"

version := "1.0-SNAPSHOT"

play.Project.playJavaSettings

lazy val root = project.in(file("."))
    .dependsOn(common)

lazy val common = project in file("modules/common")