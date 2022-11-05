buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(com.jaem.buildsrc.Depends.ClassPaths.gradle)
        classpath(com.jaem.buildsrc.Depends.ClassPaths.kotlin_gradle_plugin)
    }
}