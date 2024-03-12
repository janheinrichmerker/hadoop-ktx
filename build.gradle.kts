plugins {
    kotlin("jvm") version "1.9.23"
    `maven-publish`
}

group = "dev.reimer"
version = "0.1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.apache.hadoop:hadoop-common:3.3.6")
    implementation("org.apache.hadoop:hadoop-mapreduce-client-core:3.1.0")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
