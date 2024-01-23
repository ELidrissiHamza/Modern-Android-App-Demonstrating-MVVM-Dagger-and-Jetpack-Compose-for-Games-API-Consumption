package com.jorgesanaguaray.consumeapijetpackcompose.data.remote

import com.jorgesanaguaray.consumeapijetpackcompose.data.remote.model.GameModel
import com.jorgesanaguaray.consumeapijetpackcompose.util.Constants.Companion.GAMES_ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created Hamza
 */
/**
 * Cette interface définit les appels d'API liés aux jeux.
 */
interface GameApi {

    /**
     * Effectue une requête GET pour obtenir la liste des jeux depuis l'API.
     * Utilise l'annotation @GET avec l'URL spécifiée par GAMES_ENDPOINT.
     * La fonction est suspendue pour pouvoir être appelée depuis une coroutine.
     * Retourne une réponse Retrofit de type List<GameModel>.
     */
    @GET(GAMES_ENDPOINT)
    suspend fun getGames(): Response<List<GameModel>>

}