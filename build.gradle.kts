

plugins {
    java
    kotlin("jvm") version "1.3.72"
}


group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    experimental {
        coroutines "enable"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin('org.jetbrains.kotlinx:kotlinx-coroutines-core:0.22.5'))
    testCompile("junit", "junit", "4.12")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}