package com.ag_apps.testingwithkoin.feature.data

import com.ag_apps.testingwithkoin.feature.domain.FeatureDataSource

/**
 * @author Ahmed Guedmioui
 */
class LocalFeatureDataSource(
    private val featureDao: FeatureDao
): FeatureDataSource {

    override suspend fun getData(type: Int): String {
        return if (type == 1) {
            featureDao.dataType1()
        } else {
            featureDao.dataType2()
        }
    }

}

















