package ru.shalashov.filmappforsequenia.domain.repository

import ru.shalashov.filmappforsequenia.data.appState.AppState
import ru.shalashov.filmappforsequenia.domain.entities.FilmsList

interface Repo {

    suspend fun getFilms(): AppState<FilmsList>
}