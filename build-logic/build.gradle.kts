plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(files("../gradle/libs.versions.toml"))
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidLibrary") {
            id = "my.project.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }
        register("androidApplication") {
            id = "my.project.android.application"
            implementationClass = "AndroidAppConventionPlugin"
        }
    }
}