package net.alanproject.domain.usecases.impl

import net.alanproject.domain.model.list.Game
import net.alanproject.domain.repository.RawgRepository
import net.alanproject.domain.usecases.GetGames
import net.alanproject.domain.util.Resource
import javax.inject.Inject

class GetGamesUsecase @Inject constructor(
    private val rawgRepository: RawgRepository
) : GetGames {
    override suspend fun get(
        page: Int?,
        order: String?,
        dates: String?,
        platforms: String?
    ): Resource<List<Game>> {
        val response = try{
            rawgRepository.getGames(
                page, order, dates, platforms
            ).results
        }catch(e:Exception){
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

}