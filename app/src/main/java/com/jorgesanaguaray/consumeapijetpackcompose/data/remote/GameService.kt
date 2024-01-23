package com.jorgesanaguaray.consumeapijetpackcompose.data.remote

import com.jorgesanaguaray.consumeapijetpackcompose.data.remote.model.GameModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * Created by Hamza
 */
/**
 * Cette classe agit comme un service pour récupérer les données de jeu à partir de l'API.
 * Elle utilise l'injection de dépendances avec @Inject pour obtenir une instance de GameApi.
 */
class GameService @Inject constructor(private val gameApi: GameApi) {
    /**
     * Effectue une requête asynchrone pour obtenir la liste des jeux en utilisant l'API.
     * Utilise withContext pour exécuter la requête sur le thread d'E/S (Dispatchers.IO).
     * Retourne la liste des jeux ou une liste vide en cas d'erreur.
     */
    suspend fun getGames(): List<GameModel> {

        return withContext(Dispatchers.IO) {
            val games = gameApi.getGames()
            games.body() ?: emptyList()
        }

    }

}