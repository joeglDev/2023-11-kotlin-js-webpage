plugins {
    kotlin("js") version "1.8.21"
}

group = "me.hiroji"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}



kotlin {
    js {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {
                    enabled.set(true)
                }
            }
        }
    }
}