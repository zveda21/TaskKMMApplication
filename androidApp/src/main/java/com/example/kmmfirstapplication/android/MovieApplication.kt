package com.example.kmmfirstapplication.android

import android.app.Application
import com.example.kmmfirstapplication.android.di.appModule
import com.example.kmmfirstapplication.di.getSharedModules
import org.koin.core.context.GlobalContext.startKoin

/**
 * Created by Zveda Hayrapetyan on 7/5/23.
 */
class MovieApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}
