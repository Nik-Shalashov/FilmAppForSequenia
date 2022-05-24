package ru.shalashov.filmappforsequenia.data.datasource

import dagger.hilt.components.SingletonComponent
import it.czerwinski.android.hilt.annotations.BoundTo
import retrofit2.Response
import ru.shalashov.filmappforsequenia.data.network.FilmsApi
import ru.shalashov.filmappforsequenia.domain.entities.FilmsList
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@BoundTo(FilmsDataSource::class, SingletonComponent::class)
class FilmsRemoteDataSource @Inject constructor(
    private val api: FilmsApi
): FilmsDataSource{
    override suspend fun getFilmsList(): Response<FilmsList> = api.getFilmsList()
}