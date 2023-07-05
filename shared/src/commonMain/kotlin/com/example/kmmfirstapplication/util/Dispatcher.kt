package com.example.kmmfirstapplication.util

import kotlinx.coroutines.CoroutineDispatcher

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
internal interface Dispatcher {
    val io: CoroutineDispatcher
}

internal expect fun provideDispatcher(): Dispatcher
