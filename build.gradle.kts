plugins {
    id("io.gitlab.arturbosch.detekt").version("1.19.0-RC1")
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
    implementation("io.coil-kt:coil:1.4.0")
}
