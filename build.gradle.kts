import java.net.URL

plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven(URL("https://maven.google.com"))
}


dependencies {
    implementation("com.facebook.infer.annotation:infer-annotation:0.18.0")
    implementation("com.google.android:android:2.1_r1")
    implementation("com.google.guava:guava:24.0-jre")
    implementation("androidx.annotation:annotation:1.7.0")
    implementation("com.android.support:support-v4:24.0.0")
    implementation("com.android.support:support-v4:23.2.0")
    implementation("javax.inject:javax.inject:1")
    implementation("com.android.support:support-compat:28.0.0-alpha1")
    implementation("androidx.core:core:1.0.0")


    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}