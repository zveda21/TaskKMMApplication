package com.example.kmmfirstapplication.domain.usecase

import com.example.kmmfirstapplication.domain.model.Movie
import com.example.kmmfirstapplication.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
class GetMoviesUseCase : KoinComponent {
    private val repository: MovieRepository by inject()

    @Throws(Exception::class)
    suspend operator fun invoke(page: Int): List<Movie> {
        println("Response: " + repository.getMovies(page = page))
        return repository.getMovies(page = page)
    }
}
