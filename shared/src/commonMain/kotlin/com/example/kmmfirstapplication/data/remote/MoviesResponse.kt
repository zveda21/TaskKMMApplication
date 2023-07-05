package com.example.kmmfirstapplication.data.remote

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
@kotlinx.serialization.Serializable
internal data class MoviesResponse(
    val results: List<MovieRemote>
)
