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
    namespace = "au.com.shiftyjelly.pocketcasts.profile"
    buildFeatures {
        buildConfig = true
        viewBinding = true
        compose = true
    }
}

dependencies {
    // features
    implementation(project(":modules:features:account"))
    implementation(project(":modules:features:cartheme"))
    implementation(project(":modules:features:endofyear"))
    implementation(project(":modules:features:player"))
    implementation(project(":modules:features:podcasts"))
    implementation(project(":modules:features:settings"))

    // services
    implementation(project(":modules:services:analytics"))
    implementation(project(":modules:services:compose"))
    implementation(project(":modules:services:images"))
    implementation(project(":modules:services:localization"))
    implementation(project(":modules:services:model"))
    implementation(project(":modules:services:preferences"))
    implementation(project(":modules:services:repositories"))
    implementation(project(":modules:services:servers"))
    implementation(project(":modules:services:ui"))
    implementation(project(":modules:services:utils"))
    implementation(project(":modules:services:views"))
}
