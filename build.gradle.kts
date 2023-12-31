plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("kotlin-android")
    id ("kotlin-parcelize")
}
android {
        namespace = "com.example.myapplication"
        compileSdk = 34
        defaultConfig {
            applicationId = "com.example.myapplication"
            minSdk = 25
            targetSdk = 25
            versionCode = 1
            versionName = "1.0"
            testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        }

    dataBinding {
        enable = true    }

    buildFeatures {
        viewBinding = true        }

        buildTypes {
            release {
                isMinifyEnabled = false
                proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"                )            }        }
        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8        }
        kotlinOptions {
            jvmTarget = "1.8"        }
        buildToolsVersion = "34.0.0"
        ndkVersion = "26.1.10909125"
}
dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom:1.8.0"))
    implementation("org.jetbrains.kotlin:kotlin-android-extensions:1.8.22")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-extensions:2.2.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("android.arch.lifecycle:extensions:1.1.1")
    implementation("android.arch.lifecycle:viewmodel:1.1.1")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
