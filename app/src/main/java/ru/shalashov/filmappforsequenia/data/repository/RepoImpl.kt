package ru.shalashov.filmappforsequenia.data.repository

import dagger.hilt.components.SingletonComponent
import it.czerwinski.android.hilt.annotations.BoundTo
import retrofit2.Response
import ru.shalashov.filmappforsequenia.data.appState.AppState
import ru.shalashov.filmappforsequenia.data.datasource.FilmsDataSource
import ru.shalashov.filmappforsequenia.domain.entities.FilmsList
import ru.shalashov.filmappforsequenia.domain.repository.Repo
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@BoundTo(Repo::class, SingletonComponent::class)
class RepoImpl @Inject constructor(
    private val dataSource: FilmsDataSource
): Repo{

    override suspend fun getFilms(): AppState<FilmsList> = checkResponse(dataSource.getFilmsList())

    private fun <T> checkResponse(response: Response<T>): AppState<T> {
        return if (response.isSuccessful) AppState.Success(response.body()!!)
        else {
            AppState.Error("При загрузке данных произошла ошибка!")
        }
    }
}