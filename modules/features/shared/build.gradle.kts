plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kapt)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
    alias(libs.plugins.kotlin.parcelize)
}

apply(from = "${project.rootDir}/base.gradle")

android {
    namespace = "au.com.shiftyjelly.pocketcasts.shared"
    buildFeatures {
        buildConfig = true
        viewBinding = true
        compose = true
    }
}

dependencies {
    implementation(project(":modules:services:analytics"))
    implementation(project(":modules:services:localization"))
    implementation(project(":modules:services:preferences"))
    implementation(project(":modules:services:repositories"))
    implementation(project(":modules:services:utils"))
    implementation(project(":modules:services:model"))
    testImplementation(project(":modules:services:sharedtest"))
}
