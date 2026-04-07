plugins {
    id("java")
}

group = "org.example"
version = ""


repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":modules:moduletwo"))
    implementation(project(":modules:moduleone"))

}
