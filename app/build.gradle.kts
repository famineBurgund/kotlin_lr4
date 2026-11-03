plugins { alias(libs.plugins.android.application) }

android {
    namespace = "com.example.lr4"
    compileSdk { version = release(37) }
    defaultConfig {
        applicationId = "com.example.lr4"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies { implementation("androidx.appcompat:appcompat:1.7.1") }
