package com.example.kmmfirstapplication.di

import com.example.kmmfirstapplication.data.remote.MovieService
import com.example.kmmfirstapplication.data.remote.RemoteDataSource
import com.example.kmmfirstapplication.data.repository.MovieRepositoryImpl
import com.example.kmmfirstapplication.domain.repository.MovieRepository
import com.example.kmmfirstapplication.domain.usecase.GetMovieUseCase
import com.example.kmmfirstapplication.domain.usecase.GetMoviesUseCase
import com.example.kmmfirstapplication.util.provideDispatcher
import org.koin.dsl.module

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules












