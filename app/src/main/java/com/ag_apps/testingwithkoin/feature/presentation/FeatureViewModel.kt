package com.ag_apps.testingwithkoin.feature.presentation

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ag_apps.testingwithkoin.feature.domain.FeatureDataSource
import kotlinx.coroutines.launch

/**
 * @author Ahmed Guedmioui
 */
class FeatureViewModel(
    private val featureDataSource: FeatureDataSource
) : ViewModel() {

    var stateData by mutableStateOf("")
        private set

    fun getData(type: Int) {
        viewModelScope.launch {
            stateData = featureDataSource.getData(type)
        }
    }

}




















