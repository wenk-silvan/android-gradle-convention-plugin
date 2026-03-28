plugins {
    id("my.project.android.library")
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.conventionpluginsample.domain"
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}