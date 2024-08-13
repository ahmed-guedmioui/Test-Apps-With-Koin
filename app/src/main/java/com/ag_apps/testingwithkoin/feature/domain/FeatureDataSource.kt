package com.ag_apps.testingwithkoin.feature.domain

/**
 * @author Ahmed Guedmioui
 */
interface FeatureDataSource {
    suspend fun getData(type: Int): String
}