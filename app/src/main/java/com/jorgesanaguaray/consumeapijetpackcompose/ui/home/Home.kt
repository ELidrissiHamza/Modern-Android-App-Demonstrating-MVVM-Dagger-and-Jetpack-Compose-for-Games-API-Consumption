package com.jorgesanaguaray.consumeapijetpackcompose.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberImagePainter
import com.jorgesanaguaray.consumeapijetpackcompose.domain.item.GameItem

/**
 * Created by Hamza
 */
/**
 * Écran principal de l'application.
 * Affiche une liste de cartes de jeux à partir des données récupérées du ViewModel.
 */
@Composable
fun HomeScreen() {
    /** Obtient une instance du ViewModel HomeViewModel grâce à la fonction viewModel**/
    val homeViewModel = viewModel(modelClass = HomeViewModel::class.java)
    /** Collecte les données de jeux depuis le ViewModel en tant qu'état**/
    val games by homeViewModel.games.collectAsState()

    LazyColumn {

        items(games) { game: GameItem ->

            GameCard(game = game)

        }

    }

}
/**
 * Composant de carte représentant un jeu.
 */
@Composable
fun GameCard(game: GameItem) {

    val image = rememberImagePainter(data = game.thumbnail)

    Card(

        elevation = 5.dp,
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .padding(top = 5.dp, bottom = 5.dp, start = 10.dp, end = 10.dp)
            .fillMaxSize()

    ) {

        Column {

            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(250.dp)
            )

            Column(modifier = Modifier.padding(10.dp)) {

                Text(text = game.title, fontWeight = FontWeight.Bold)
                Text(text = game.short_description, maxLines = 2, overflow = TextOverflow.Ellipsis)

            }

        }

    }

}