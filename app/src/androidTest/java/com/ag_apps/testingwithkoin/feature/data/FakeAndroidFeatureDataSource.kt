package com.ag_apps.testingwithkoin.feature.data

import com.ag_apps.testingwithkoin.feature.domain.FeatureDataSource

/**
 * @author Ahmed Guedmioui
 */
class FakeAndroidFeatureDataSource: FeatureDataSource {

    override suspend fun getData(type: Int): String {
        return if (type == 1) {
            "Test Type 1"
        } else {
            "Test Type 2"
        }
    }

}

















