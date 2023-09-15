package com.applligent.koindi

import android.app.Application
import com.applligent.koindi.di.module.appModule
import com.applligent.koindi.di.module.repoModule
import com.applligent.koindi.di.module.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(listOf(appModule, repoModule, viewModelModule))
        }
    }
}