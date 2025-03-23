plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    testImplementation("org.assertj:assertj-core:3.27.3")

    implementation("org.apache.logging.log4j:log4j-core:2.24.3")
    runtimeOnly("org.apache.logging.log4j:log4j-api:2.24.3")

    implementation("org.apache.logging.log4j:log4j-slf4j2-impl:2.24.3")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}

application {
    mainClass = "de.hacker.benjamin.App"
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}