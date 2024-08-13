package com.ag_apps.testingwithkoin.feature.presentation

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.ag_apps.testingwithkoin.MainCoroutineRule
import com.ag_apps.testingwithkoin.feature.data.FakeFeatureDataSource
import com.google.common.truth.Truth
import org.junit.Rule
import org.junit.Test


/**
 * @author Ahmed Guedmioui
 */
class FeatureViewModelTest {
    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @get:Rule
    var mainCoroutineRule = MainCoroutineRule()

    private val dataSource = FakeFeatureDataSource()
    private val viewModel = FeatureViewModel(dataSource)

    @Test
    fun `get data type 1, is data of type 1` () {
        viewModel.getData(1)

        mainCoroutineRule.dispatcher.scheduler.advanceUntilIdle()

        Truth.assertThat(
            viewModel.stateData
        ).isEqualTo("Test Type 1")
    }


    @Test
    fun `get data type 2, is data of type 2` () {
        viewModel.getData(2)

        mainCoroutineRule.dispatcher.scheduler.advanceUntilIdle()

        Truth.assertThat(
            viewModel.stateData
        ).isEqualTo("Test Type 2")
    }
}


















