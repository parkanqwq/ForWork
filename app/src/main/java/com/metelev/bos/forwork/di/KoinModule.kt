package com.metelev.bos.forwork.di

import com.metelev.bos.forwork.rets.ImageApi
import com.metelev.bos.forwork.ui.MainActivityViewModel
import io.reactivex.schedulers.Schedulers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

val viewModelModule = module {
    viewModel { MainActivityViewModel() }
}

val retrofitModule = module {
    factory<ImageApi> {
        Retrofit.Builder()
            .baseUrl("https://dev-tasks.alef.im/")
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.createWithScheduler(Schedulers.io()))
            .build().create(ImageApi::class.java)
    }
}