package com.jorgesanaguaray.consumeapijetpackcompose.repo

import com.jorgesanaguaray.consumeapijetpackcompose.data.remote.GameService
import com.jorgesanaguaray.consumeapijetpackcompose.domain.item.GameItem
import com.jorgesanaguaray.consumeapijetpackcompose.domain.item.toGameItem
import javax.inject.Inject

/**
 * Created by Hamza
 */
/**
 * Cette classe de repository, GameRepository, agit comme une couche d'abstraction entre la source de données et les cas d'utilisation.
 * Elle utilise l'injection de dépendances avec @Inject pour obtenir une instance de GameService.
 */
class GameRepository @Inject constructor(private val gameService: GameService) {
    /**
     * Fonction suspendue appelée pour récupérer la liste des jeux à partir du service.
     * La liste de GameModel obtenue du service est ensuite transformée en une liste de GameItem.
     */
    suspend fun getGames(): List<GameItem> {

        return gameService.getGames().map {
            it.toGameItem()
        }

    }

}