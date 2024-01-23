package com.jorgesanaguaray.consumeapijetpackcompose.domain

import com.jorgesanaguaray.consumeapijetpackcompose.domain.item.GameItem
import com.jorgesanaguaray.consumeapijetpackcompose.repo.GameRepository
import javax.inject.Inject

/**
 * Created by Hamza
 */
/**
 * Cette classe de cas d'utilisation représente le cas d'utilisation "GetGamesUseCase".
 * Elle est responsable de fournir la logique métier pour obtenir la liste des jeux à partir du repository.
 * Utilise l'injection de dépendances avec @Inject pour obtenir une instance de GameRepository.
 */
class GetGamesUseCase @Inject constructor(private val gameRepository: GameRepository) {
    /**
     * Fonction suspendue appelée pour récupérer la liste des jeux à partir du repository.
     * La liste est ensuite mélangée (shuffled) avant d'être renvoyée.
     */
    suspend operator fun invoke(): List<GameItem> {

        return gameRepository.getGames().shuffled()

    }

}