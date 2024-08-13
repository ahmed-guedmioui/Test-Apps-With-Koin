package com.ag_apps.testingwithkoin.feature.di

import com.ag_apps.testingwithkoin.feature.data.FakeAndroidFeatureDataSource
import com.ag_apps.testingwithkoin.feature.data.FeatureDao
import com.ag_apps.testingwithkoin.feature.domain.FeatureDataSource
import com.ag_apps.testingwithkoin.feature.presentation.FeatureViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

/**
 * @author Ahmed Guedmioui
 */
val testFeatureModule = module {
    single { FeatureDao(get()) }

//    single {
//        Room.inMemoryDatabaseBuilder(
//            androidApplication(),
//            Database::class.java,
//        ).build()
//    }


    singleOf(::FakeAndroidFeatureDataSource).bind<FeatureDataSource>()
//    single<FeatureDataSource> { FakeAndroidFeatureDataSource() }

    viewModel { FeatureViewModel(get()) }

}














