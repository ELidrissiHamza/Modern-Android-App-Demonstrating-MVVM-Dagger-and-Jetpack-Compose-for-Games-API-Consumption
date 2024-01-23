package com.jorgesanaguaray.consumeapijetpackcompose.data.remote.model

/**
 * Created Hamza
 */
/**
 * Cette classe de données représente le modèle d'un jeu obtenu à partir de l'API.
 * Elle est utilisée pour stocker les détails d'un jeu, tels que l'identifiant, le titre, l'image miniature et la description courte.
 */
data class GameModel(

    val id: Int,
    val title: String,
    val thumbnail: String,//image
    val short_description: String//description

)
