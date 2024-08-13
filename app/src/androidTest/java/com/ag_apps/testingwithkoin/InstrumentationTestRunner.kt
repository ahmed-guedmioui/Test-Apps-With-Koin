package com.ag_apps.testingwithkoin

import android.app.Application
import android.content.Context
import androidx.test.runner.AndroidJUnitRunner

/**
 * @author Ahmed Guedmioui
 */
class InstrumentationTestRunner : AndroidJUnitRunner() {
    override fun newApplication(
        classLoader: ClassLoader?,
        className: String?,
        context: Context?
    ): Application {
        return super.newApplication(
            classLoader,
            TestingApp::class.java.name,
            context
        )
    }
}


