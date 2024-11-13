plugins {
    application
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(23)
    }
}

application {
    mainClass.set("com.github.bgalek.backend.BackendApplication")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(project("backend"))
    implementation(project("frontend"))
}