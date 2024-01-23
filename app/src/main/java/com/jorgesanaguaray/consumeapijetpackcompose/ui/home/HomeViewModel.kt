package com.jorgesanaguaray.consumeapijetpackcompose.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jorgesanaguaray.consumeapijetpackcompose.domain.GetGamesUseCase
import com.jorgesanaguaray.consumeapijetpackcompose.domain.item.GameItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * Created by Hamza
 */
/**
 * ViewModel associé à l'écran principal (HomeScreen).
 * Utilise HiltViewModel pour l'injection de dépendances avec Dagger Hilt.
 */
@HiltViewModel
class HomeViewModel @Inject constructor(private val getGamesUseCase: GetGamesUseCase) : ViewModel() {

    /**Utilisation d'un MutableStateFlow pour gérer l'état de la liste de jeux dans l'UI**/
    private val _games = MutableStateFlow(emptyList<GameItem>())
    val games: StateFlow<List<GameItem>> get() = _games

    /**Fonction d'initialisation appelée lors de la création du ViewModel**/
    init {
        getGames()
    }

    /***Fonction privée appelée pour obtenir la liste des jeux depuis le cas d'utilisation GetGamesUseCase**/
    private fun getGames() {

        /**Utilisation de viewModelScope pour lancer la coroutine associée au cycle de vie du ViewModel**/
        viewModelScope.launch {

            try {

                val games = getGamesUseCase()
                _games.value = games

            } catch (_: Exception) {}

        }

    }

}