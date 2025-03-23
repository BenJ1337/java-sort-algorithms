plugins {
    application
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework:spring-core:6.2.5")
    implementation("org.springframework:spring-beans:6.2.5")
    implementation("org.springframework:spring-context:6.2.5")

    implementation("org.projectlombok:lombok:1.18.36")
    annotationProcessor("org.projectlombok:lombok:1.18.36")

    implementation("jakarta.inject:jakarta.inject-api:2.0.1")

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