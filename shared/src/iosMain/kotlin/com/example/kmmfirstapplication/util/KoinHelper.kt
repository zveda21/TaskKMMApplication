package com.example.kmmfirstapplication.util

import com.example.kmmfirstapplication.di.getSharedModules
import org.koin.core.context.startKoin

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
fun initKoin() {
    startKoin {
        modules(getSharedModules())
    }
}
