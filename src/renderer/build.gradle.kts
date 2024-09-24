plugins {
    kotlin("multiplatform") version "2.0.20"
}

group = "com.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    js {
        browser()
        binaries.executable()
    }
    sourceSets.jsMain.dependencies {
        implementation("io.kvision:kvision:8.0.0")
    }
}

tasks.named("jsBrowserDevelopmentWebpack") {
    doLast {
        copy {
            from(
                arrayOf(
                    projectDir.resolve("build/kotlin-webpack/js/developmentExecutable/${project.name}.js"),
                    projectDir.resolve("src/jsMain/resources/${project.name}.html")
                )
            )
            into(rootDir.resolve("output/"))
        }
    }
}
tasks.named("jsBrowserProductionWebpack") {
    doLast {
        copy {
            from(
                arrayOf(
                    projectDir.resolve("build/kotlin-webpack/js/productionExecutable/${project.name}.js"),
                    projectDir.resolve("src/jsMain/resources/${project.name}.html")
                )
            )
            into(rootDir.resolve("output/"))
        }
        copy {
            from(projectDir.resolve("src/jsMain/js/resources/${project.name}.html"))
            into(rootDir.resolve("output/"))
        }
    }
}