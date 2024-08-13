package com.ag_apps.testingwithkoin.feature.data

import android.app.Application
import com.ag_apps.testingwithkoin.R

/**
 * @author Ahmed Guedmioui
 */
class FeatureDao(
  private val application: Application
) {
    suspend fun dataType1(): String {
        return application.getString(R.string.type_1)
    }

    suspend fun dataType2(): String {
        return application.getString(R.string.type_2)
    }
}