package ru.shalashov.filmappforsequenia.data.datasource

import retrofit2.Response
import ru.shalashov.filmappforsequenia.domain.entities.FilmsList

interface FilmsDataSource {

    suspend fun getFilmsList(): Response<FilmsList>
}