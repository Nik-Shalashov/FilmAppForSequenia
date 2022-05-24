package ru.shalashov.filmappforsequenia.domain.entities

data class Film(
    val id: Int,
    val localized_name: String,
    val name: String,
    val year: Int,
    val rating: Float,
    val image_url: String,
    val description: String,
    val genres: List<Genre>
)