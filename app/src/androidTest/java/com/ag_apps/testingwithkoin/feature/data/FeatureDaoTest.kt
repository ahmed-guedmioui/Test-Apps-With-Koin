package com.ag_apps.testingwithkoin.feature.data

import com.google.common.truth.Truth
import kotlinx.coroutines.test.runTest
import org.junit.After
import org.junit.Test
import org.koin.test.KoinTest
import org.koin.test.inject


/**
 * @author Ahmed Guedmioui
 */
class FeatureDaoTest: KoinTest {
    private val featureDao: FeatureDao by inject()
//    private val database: Database by inject()

    @After
    fun tearDown() {
//        database.close()
    }


    @Test
    fun getDataType1_isDataOfType1() = runTest {
        Truth.assertThat(featureDao.dataType1())
            .isEqualTo("Type 1")
    }

    @Test
    fun getDataType2_isDataOfType2() = runTest {
        Truth.assertThat(featureDao.dataType2())
            .isEqualTo("Type 2")
    }

}




















