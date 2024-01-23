package com.jorgesanaguaray.consumeapijetpackcompose.di

import com.jorgesanaguaray.consumeapijetpackcompose.data.remote.GameApi
import com.jorgesanaguaray.consumeapijetpackcompose.util.Constants.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by Hamza
 */
/**
 * Ce module Dagger Hilt fournit les instances nécessaires pour effectuer des appels d'API.
 * Il est installé dans le composant SingletonComponent, ce qui signifie que ces instances seront uniques dans toute l'application.
 */
@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    /**
     * Fournit une instance unique de Retrofit pour effectuer des appels d'API.
     */
    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {

        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    /**
     * Fournit une instance unique de GameApi en utilisant Retrofit.
     */
    @Singleton
    @Provides
    fun provideGameApi(retrofit: Retrofit): GameApi {
        return retrofit.create(GameApi::class.java)
    }

}