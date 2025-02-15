plugins {
    id("template.convention.lint")
    id("template.convention.kmp")
    id("template.convention.kmp.android")
    id("template.convention.kmp.ios")
    id("template.convention.kmp.compose")
    id("template.convention.kotlin.serialization")
}

android.namespace = "dev.yjyoon.template.feature.main"

kotlin {
    sourceSets {
        commonMain.dependencies {
            implementation(projects.core.ui)
            implementation(projects.core.common)
            implementation(projects.core.model)
            implementation(projects.core.data)

            implementation(libs.navigation.compose)

            implementation(libs.kotlinx.serialization.json)
            implementation(libs.kotlinx.datetime)
            implementation(libs.coroutines.core)

            implementation(libs.koin.core)

            implementation(libs.coil.compose)
            implementation(libs.coil.ktor)
        }
    }
}
