package com.example.kmmfirstapplication.data.repository

import com.example.kmmfirstapplication.data.remote.RemoteDataSource
import com.example.kmmfirstapplication.data.util.toMovie
import com.example.kmmfirstapplication.domain.model.Movie
import com.example.kmmfirstapplication.domain.repository.MovieRepository

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
internal class MovieRepositoryImpl(
    private val remoteDateSource: RemoteDataSource
) : MovieRepository {

    override suspend fun getMovies(page: Int): List<Movie> {
        println("Bla--" + remoteDateSource.getMovies(page = page))
        return remoteDateSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDateSource.getMovie(movieId = movieId).toMovie()
    }
}