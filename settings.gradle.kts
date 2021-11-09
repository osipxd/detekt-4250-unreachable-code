pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }

    resolutionStrategy {
        eachPlugin {
            val id = requested.id.id
            if (id.startsWith("com.android")) useModule("com.android.tools.build:gradle:${requested.version}")
        }
    }
}

rootProject.name = "detekt-unreachable-code"

