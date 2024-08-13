package com.ag_apps.testingwithkoin

import android.app.Application
import androidx.test.platform.app.InstrumentationRegistry
import com.ag_apps.testingwithkoin.feature.di.testFeatureModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * @author Ahmed Guedmioui
 */
class TestingApp: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(
                InstrumentationRegistry.getInstrumentation()
                    .targetContext.applicationContext
            )
            modules(testFeatureModule)
        }
    }
}












