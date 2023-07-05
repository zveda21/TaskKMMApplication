package com.example.kmmfirstapplication.android.presentation.components.detail

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kmmfirstapplication.domain.model.Movie
import com.example.kmmfirstapplication.domain.usecase.GetMovieUseCase
import kotlinx.coroutines.launch

/**
 * Created by Zveda Hayrapetyan on 7/5/23.
 */
class DetailViewModel(
    val getMovieUseCase: GetMovieUseCase,
    val movieId: Int
) : ViewModel() {
    var uiState by mutableStateOf(DetailScreenState())

    init {
        loadMovie(movieId)
    }

    private fun loadMovie(movieId: Int) {
        viewModelScope.launch {
            uiState = uiState.copy(loading = true)

            uiState = try {
                val movie = getMovieUseCase(movieId = movieId)
                uiState.copy(loading = false, movie = movie)
            } catch (error: Throwable) {
                uiState.copy(
                    loading = false,
                    errorMessage = "Could not load the movie"
                )
            }
        }
    }
}

data class DetailScreenState(
    var loading: Boolean = false,
    var movie: Movie? = null,
    var errorMessage: String? = null
)
