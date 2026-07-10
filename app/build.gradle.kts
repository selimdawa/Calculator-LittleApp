plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.ksp)
    alias(libs.plugins.dagger.hilt.android)
    alias(libs.plugins.navigation.safeargs.kotlin)
}

android {
    namespace = "com.littleapp.calculator"
    compileSdk {
        version = release(37)
    }

    defaultConfig {
        applicationId = "com.littleapp.calculator"
        minSdk = 24
        targetSdk = 37
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.preference.ktx)           //Shared Preference
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //Layout
    implementation(libs.androidx.constraintlayout)
    implementation(libs.material)
    //Life Cycle
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.lifecycle.livedata.ktx)
    //Kotlin Coroutines
    implementation(libs.kotlinx.coroutines.core)   //Core
    implementation(libs.kotlinx.coroutines.android) //Android
    //Navigation
    implementation(libs.navigation.fragment.ktx)  //Navigation Fragment
    implementation(libs.navigation.ui.ktx)      //Navigation Components
    implementation(libs.navigation.dynamic.features)
    //Room
    implementation(libs.room.runtime)
    ksp(libs.room.compiler)
    //Dagger - Hilt
    implementation(libs.hilt.android)
    ksp(libs.hilt.android.compiler)
    implementation(libs.hilt.navigation.fragment)
    //Other's
    implementation(libs.exp4j)                          //Calculator
    implementation(libs.timber)                         //Timber Log
}