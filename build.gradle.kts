plugins {
    java
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

tasks.register("echo") {
    doLast {
        ProcessBuilder("echo", "hello")
            .inheritIO()
            .start()
            .waitFor()
    }
}

application {
    mainClass.set("Main")
}