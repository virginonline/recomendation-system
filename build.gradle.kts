plugins {
    id("java")
}

group = "com.virginonline"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.ejml:ejml-simple:0.43.1")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}