plugins {
    kotlin("jvm") version "1.5.10"
    `maven-publish`
}

group = "com.andreikingsley"
version = "0.2"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.andreikingsley"
            artifactId = "ggdsl_proto"
            version = "1.0.1"

            from(components["java"])
        }
    }
}