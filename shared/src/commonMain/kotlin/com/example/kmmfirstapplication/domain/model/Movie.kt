package com.example.kmmfirstapplication.domain.model

/**
 * Created by Zveda Hayrapetyan on 7/3/23.
 */
data class Movie(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val releaseDate: String
)
