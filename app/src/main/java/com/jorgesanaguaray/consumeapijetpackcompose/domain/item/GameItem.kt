package com.jorgesanaguaray.consumeapijetpackcompose.domain.item

import com.jorgesanaguaray.consumeapijetpackcompose.data.remote.model.GameModel

/**
 * Created by Hamza
 */
/**
 * Cette classe de domaine représente un objet "GameItem" qui est une version simplifiée du modèle GameModel.
 * Elle est utilisée pour représenter les données de jeu dans la couche de domaine de l'application.
 */
data class GameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String

)
/**
 * Extension de la classe GameModel permettant de convertir une instance de GameModel en GameItem.
 * Cette fonction est utilisée pour mapper les données de l'API vers un format plus adapté à la couche de domaine.
 */
fun GameModel.toGameItem() = GameItem(id, title, thumbnail, short_description)
