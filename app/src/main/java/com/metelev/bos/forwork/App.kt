package com.metelev.bos.forwork

import android.app.Application
import com.metelev.bos.forwork.di.retrofitModule
import com.metelev.bos.forwork.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        GlobalContext.startKoin {
            androidContext(this@App)
            modules(viewModelModule, retrofitModule)
        }
    }
}