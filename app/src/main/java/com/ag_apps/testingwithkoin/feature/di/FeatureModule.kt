package com.ag_apps.testingwithkoin.feature.di

import com.ag_apps.testingwithkoin.feature.data.FeatureDao
import com.ag_apps.testingwithkoin.feature.data.LocalFeatureDataSource
import com.ag_apps.testingwithkoin.feature.domain.FeatureDataSource
import com.ag_apps.testingwithkoin.feature.presentation.FeatureViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * @author Ahmed Guedmioui
 */

val featureModule = module {
    single { FeatureDao(get()) }

    singleOf(::LocalFeatureDataSource).bind<FeatureDataSource>()
//    single<FeatureDataSource> { LocalFeatureDataSource(get()) }

    viewModel { FeatureViewModel(get()) }
}












