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
}


tasks.named("jsBrowserDevelopmentWebpack") {
    doLast {
        copy {
            from(projectDir.resolve("build/kotlin-webpack/js/developmentExecutable/${project.name}.js"))
            into(rootDir.resolve("output/"))
        }
    }
}
tasks.named("jsBrowserProductionWebpack") {
    doLast {
        copy {
            from(projectDir.resolve("build/kotlin-webpack/js/productionExecutable/${project.name}.js"))
            into(rootDir.resolve("output/"))
        }
    }
}