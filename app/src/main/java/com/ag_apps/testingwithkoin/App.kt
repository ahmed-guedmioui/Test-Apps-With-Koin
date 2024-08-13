package com.ag_apps.testingwithkoin

import android.app.Application
import com.ag_apps.testingwithkoin.feature.di.featureModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

/**
 * @author Ahmed Guedmioui
 */
class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                featureModule
            )
        }
    }
}