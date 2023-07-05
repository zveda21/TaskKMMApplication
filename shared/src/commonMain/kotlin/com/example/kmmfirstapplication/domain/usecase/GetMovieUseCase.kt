package com.example.kmmfirstapplication.domain.usecase

import com.example.kmmfirstapplication.domain.model.Movie
import com.example.kmmfirstapplication.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
class GetMovieUseCase : KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(movieId: Int): Movie {
        return repository.getMovie(movieId = movieId)
    }
}
