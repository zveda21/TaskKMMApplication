package com.example.kmmfirstapplication.data.remote

import com.example.kmmfirstapplication.util.Dispatcher
import kotlinx.coroutines.withContext

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
internal class RemoteDataSource(
    private val apiService: MovieService,
    private val dispatcher: Dispatcher
) {

    suspend fun getMovies(page: Int) = withContext(dispatcher.io) {
        apiService.getMovies(page = page)
    }

    suspend fun getMovie(movieId: Int) = withContext(dispatcher.io) {
        apiService.getMovie(movieId = movieId)
    }
}