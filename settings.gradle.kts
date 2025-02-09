pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
        maven("https://storage.googleapis.com/r8-releases/raw")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
        maven("https://androidx.dev/storage/compose-compiler/repository/")
        maven("https://androidx.dev/snapshots/builds/11446609/artifacts/repository")
    }
}

enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
rootProject.name = "EhViewer"
include(":app")
