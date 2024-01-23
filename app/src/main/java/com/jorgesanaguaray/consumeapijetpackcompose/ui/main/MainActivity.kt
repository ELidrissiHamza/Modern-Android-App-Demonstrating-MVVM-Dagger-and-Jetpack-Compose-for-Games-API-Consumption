package com.jorgesanaguaray.consumeapijetpackcompose.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.jorgesanaguaray.consumeapijetpackcompose.ui.home.HomeScreen
import com.jorgesanaguaray.consumeapijetpackcompose.ui.theme.ConsumeApiJetpackComposeTutorialTheme
import dagger.hilt.android.AndroidEntryPoint
/**
 * Activité principale de l'application.
 * Utilise Dagger Hilt pour l'injection de dépendances avec @AndroidEntryPoint.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /**Définit le contenu de l'activité avec Compose**/
        setContent {

            /**Utilise le thème principal de l'application**/
            ConsumeApiJetpackComposeTutorialTheme {

                Surface(

                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background

                ) {

                    /**Affiche l'écran principal de l'application**/
                    HomeScreen()

                }

            }

        }

    }

}