object Libs {
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.3"

    const val junit = "junit:junit:4.13"

    const val material = "com.google.android.material:material:1.3.0"

    object Accompanist {
        const val version = "0.22.0-rc"
        const val permissions = "com.google.accompanist:accompanist-permissions:$version"
    }

    object Kotlin {
        private const val version = "1.6.10"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object Coroutines {
        private const val version = "1.5.2"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.4.0"
        const val coreKtx = "androidx.core:core-ktx:1.7.0"

        object Lifecycle {
            private const val version = "2.4.0"
            const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$version"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
        }

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.4.0"
        }

        object Compose {
            const val version = "1.1.0-rc01"

            const val foundation = "androidx.compose.foundation:foundation:$version"
            const val layout = "androidx.compose.foundation:foundation-layout:$version"
            const val material = "androidx.compose.material:material:$version"
            const val materialIconsExtended = "androidx.compose.material:material-icons-extended:$version"
            const val runtime = "androidx.compose.runtime:runtime:$version"
            const val runtimeLivedata = "androidx.compose.runtime:runtime-livedata:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
            const val test = "androidx.compose.test:test-core:$version"
            const val uiTest = "androidx.compose.ui:ui-test:$version"
        }

        object Navigation {
            private const val version = "2.3.4"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Material {
            private const val version = "1.3.0"
            const val material = "com.google.android.material:material:$version"
        }

        object Test {
            private const val version = "1.4.0"
            const val core = "androidx.test:core:$version"
            const val rules = "androidx.test:rules:$version"

            object Ext {
                private const val version = "1.1.2"
                const val junit = "androidx.test.ext:junit-ktx:$version"
            }

            const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
        }
    }

    object Coil {
        const val coilCompose = "io.coil-kt:coil-compose:1.3.2"
    }
}
