package ru.shalashov.filmappforsequenia.domain.usecases

import ru.shalashov.filmappforsequenia.domain.repository.Repo
import javax.inject.Inject

class GetFilmsListUseCase @Inject constructor(
    private val repo: Repo
) {
    suspend operator fun invoke() = repo.getFilms()
}