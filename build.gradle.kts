plugins {
    java
    alias(libs.plugins.shadow)
    eclipse
    
}

dependencies {
    implementation(projects.placeholderapiExpansionPaper)
}

tasks {
    shadowJar {
        archiveFileName.set("${rootProject.name}-${project.version}.jar")
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }
    build {
        dependsOn(shadowJar)
    }
}
