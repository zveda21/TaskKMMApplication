package com.example.kmmfirstapplication.data.remote

import kotlinx.serialization.SerialName

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
@kotlinx.serialization.Serializable
internal data class MovieRemote(
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterImage: String,
    @SerialName("release_date")
    val releaseDate: String
)
