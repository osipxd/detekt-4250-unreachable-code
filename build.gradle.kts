plugins {
    id("com.android.library") version "7.0.3"
    kotlin("android") version "1.5.31"
}

group = "org.example"
version = "1.0-SNAPSHOT"

android {
    setCompileSdkVersion(31)
}

repositories {
    mavenCentral()
    google()
}

dependencies {
    implementation(kotlin("stdlib"))
}
