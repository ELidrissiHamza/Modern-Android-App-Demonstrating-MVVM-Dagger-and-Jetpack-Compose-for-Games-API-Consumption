package com.jorgesanaguaray.consumeapijetpackcompose.app

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * Created by Hamza
 */
/**
 * Cette classe représente la classe Application principale de l'application.
 * Elle est annotée avec @HiltAndroidApp pour intégrer Dagger Hilt pour l'injection de dépendances.
 */
@HiltAndroidApp
class ConsumeApiJetpackCompose : Application()