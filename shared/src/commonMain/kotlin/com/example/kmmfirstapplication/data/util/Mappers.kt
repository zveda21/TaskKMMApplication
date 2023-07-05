package com.example.kmmfirstapplication.data.util

import com.example.kmmfirstapplication.data.remote.MovieRemote
import com.example.kmmfirstapplication.domain.model.Movie

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
internal fun MovieRemote.toMovie(): Movie {
    return Movie(
        id = id,
        title = title,
        description = overview,
        imageUrl = getImageUrl(posterImage),
        releaseDate = releaseDate
    )
}

private fun getImageUrl(posterImage: String) = "https://image.tmdb.org/t/p/w500/$posterImage"
