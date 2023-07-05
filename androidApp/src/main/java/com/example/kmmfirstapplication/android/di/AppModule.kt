package com.example.kmmfirstapplication.android.di

import com.example.kmmfirstapplication.android.presentation.components.detail.DetailViewModel
import com.example.kmmfirstapplication.android.presentation.components.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
/**
 * Created by Zveda Hayrapetyan on 7/5/23.
 */
val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get()) }
}
