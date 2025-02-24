
plugins {
    pmd
    jacoco
    `java-library`

    alias(libs.plugins.com.diffplug.spotless)
    alias(libs.plugins.com.github.ben.manes.versions)
    alias(libs.plugins.com.adarshr.test.logger)
    alias(libs.plugins.com.github.spotbugs)

    alias(libs.plugins.org.jetbrains.kotlin.jvm)
    alias(libs.plugins.org.jetbrains.kotlin.plugin.serialization)
}

group = "com.yqmonline"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation(libs.io.ktor.ktor.client.mock)

    implementation(libs.org.jetbrains.kotlinx.kotlinx.datetime)
    implementation(libs.io.ktor.ktor.client.core)
    implementation(libs.io.ktor.ktor.client.cio)
    implementation(libs.io.ktor.ktor.client.logging)
    implementation(libs.io.ktor.ktor.client.content.negotiation)
    implementation(libs.io.ktor.ktor.client.auth)
    implementation(libs.io.ktor.ktor.serialization.jackson)
    implementation(libs.org.jetbrains.kotlinx.kotlinx.serializaiton.json)
    implementation(libs.com.sksamuel.hoplite.hoplite.core)
    implementation(libs.com.sksamuel.hoplite.hoplite.yaml)

    spotbugsPlugins(libs.com.h3xstream.findsecbugs.findsecbugs.plugin)
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.jacocoTestReport {
    reports {
        xml.required = true
        html.required = true
    }
}
kotlin {
    jvmToolchain(21)
}
configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        ktlint("1.5.0")
    }
    kotlinGradle {
        ktlint("1.5.0")
    }
}

configure<com.github.spotbugs.snom.SpotBugsExtension> {
    toolVersion = "4.8.3"
    ignoreFailures = true
    showProgress = true
    effort = com.github.spotbugs.snom.Effort.MAX
    reportLevel = com.github.spotbugs.snom.Confidence.LOW
}
tasks.withType<com.github.spotbugs.snom.SpotBugsTask> {
    reports.create("html").required = true
    reports.create("xml").required = true
}

fun isNonStable(version: String): Boolean {
    val stableKeyword = listOf("RELEASE", "FINAL", "GA").any { version.uppercase().contains(it) }
    val regex = "^[0-9,.v-]+(-r)?$".toRegex()
    val isStable = stableKeyword || regex.matches(version)
    return isStable.not()
}
tasks.withType<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask> {
    rejectVersionIf {
        isNonStable(candidate.version) and !isNonStable(currentVersion)
    }
}

tasks.jacocoTestReport { dependsOn(tasks.test) }
tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> { dependsOn(tasks.spotlessApply) }
