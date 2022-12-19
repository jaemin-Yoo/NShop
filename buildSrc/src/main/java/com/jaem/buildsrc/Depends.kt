package com.jaem.buildsrc

import com.jaem.buildsrc.Depends.Versions.appVersionCode

object Depends {

    object Versions {
        const val appVersionCode = 1_000_000
        const val gradleVersion = "7.0.4"
        const val androidCompileSdkVersion = 32
        const val targetSdkVersion = 32
        const val minSdkVersion = 23
        const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        const val constraintLayoutVersion = "2.1.4"
        const val supportVersion = "1.5.1"
        const val materialVersion = "1.6.1"
        const val coreKtxVersion = "1.7.0"
        const val junitVersion = "4.13.2"
        const val testExtJunitVersion = "1.1.3"
        const val espressoVersion = "3.4.0"
        const val application = "7.3.1"
        const val library = "7.3.1"

        const val bottomNavigationVersion = "1.6.0-alpha02"
        const val navigationVersion = "2.5.2"
        const val hiltVersion = "2.40.1"
        const val kotlinGradlePluginVersion = "1.7.20"
        const val roomVersion = "2.2.6"
        const val coroutinesCoreVersion = "1.5.0"
        const val coroutinesAndroidVersion = "1.6.0"
        const val splashVersion = "1.0.0"
    }

    object ClassPaths {
        const val gradle = "com.android.tools.build:gradle:${Versions.gradleVersion}"
        const val kotlin_gradle_plugin =
            "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinGradlePluginVersion}"
        const val navigation_gradle_plugin =
            "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigationVersion}"
        const val hilt_android_gradle_plugin =
            "com.google.dagger:hilt-android-gradle-plugin:${Versions.hiltVersion}"
    }

    object Libraries {
        const val android_core_ktx =
            "androidx.core:core-ktx:${Versions.coreKtxVersion}"
        const val appcompat = "androidx.appcompat:appcompat:${Versions.supportVersion}"
        const val material = "com.google.android.material:material:${Versions.materialVersion}"
        const val constraintlayout =
            "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
        const val junit = "junit:junit:${Versions.junitVersion}"
        const val test_ext_junit = "androidx.test.ext:junit:${Versions.testExtJunitVersion}"
        const val espresso_core = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
        const val bottom_navigation =
            "com.google.android.material:material:${Versions.bottomNavigationVersion}"
        const val navigation_fragment_ktx =
            "androidx.navigation:navigation-fragment-ktx:${Versions.navigationVersion}"
        const val navigation_ui_ktx =
            "androidx.navigation:navigation-ui-ktx:${Versions.navigationVersion}"

        const val splash_screen =
            "androidx.core:core-splashscreen:${Versions.splashVersion}"

        const val hilt_android =
            "com.google.dagger:hilt-android:${Versions.hiltVersion}"
        const val hilt_android_compiler =
            "com.google.dagger:hilt-android-compiler:${Versions.hiltVersion}"

        const val room_runtime = "androidx.room:room-runtime:${Versions.roomVersion}"
        const val room_compiler = "androidx.room:room-compiler:${Versions.roomVersion}"
        const val room_ktx = "androidx.room:room-ktx:${Versions.roomVersion}"

        const val coroutines_core =
            "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesCoreVersion}"
        const val coroutines_android =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesAndroidVersion}"
    }

    fun generateVersionName(): String {
        val patch: Int = appVersionCode.rem(1000)
        val minor: Int = (appVersionCode / 1000).rem(1000)
        val major: Int = (appVersionCode / 1000000).rem(1000)

        return "$major.$minor.$patch"
    }
}