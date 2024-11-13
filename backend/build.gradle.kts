plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:3.3.5")

    testImplementation("org.springframework.boot:spring-boot-starter-test:3.3.5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.3")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
