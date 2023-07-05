package com.example.kmmfirstapplication.domain.repository

import com.example.kmmfirstapplication.domain.model.Movie

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
internal interface MovieRepository {
    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}
