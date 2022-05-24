package ru.shalashov.filmappforsequenia.data.network

import retrofit2.Response
import retrofit2.http.GET
import ru.shalashov.filmappforsequenia.domain.entities.FilmsList

interface FilmsApi {

    @GET("sequeniatesttask/films.json")
    suspend fun getFilmsList(): Response<FilmsList>
}