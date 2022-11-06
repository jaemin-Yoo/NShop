buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(com.jaem.buildsrc.Depends.ClassPaths.gradle)
        classpath(com.jaem.buildsrc.Depends.ClassPaths.kotlin_gradle_plugin)
        classpath(com.jaem.buildsrc.Depends.ClassPaths.navigation_gradle_plugin)
    }
}