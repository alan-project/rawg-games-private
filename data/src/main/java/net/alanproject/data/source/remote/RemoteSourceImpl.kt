package net.alanproject.data.source.remote

import net.alanproject.data.source.RemoteSource
import net.alanproject.domain.model.response.Game
import net.alanproject.domain.model.response.Response
import timber.log.Timber
import javax.inject.Inject

class RemoteSourceImpl @Inject constructor(
    private val api: RawgApi
) : RemoteSource {
    override suspend fun getGames(
        page: Int?,
        order: String?,
        dates: String?,
        platforms: String?,
        genres:String?
    ): Response {

        Timber.d("page:$page, order:$order, dates:$dates, platforms:$platforms")
        return api.getGames(page = page, order = order, dates = dates, platforms = platforms, genres = genres)
    }

    override suspend fun getGame(id: Int): Game {
        return api.getGame(id = id)
    }
}