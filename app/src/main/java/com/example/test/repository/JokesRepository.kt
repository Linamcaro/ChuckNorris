package com.example.test.repository

import com.example.test.model.APIService

class JokesRepository (private val apiService: APIService) {

    suspend fun getCategory() = apiService.getCategory()

    suspend fun getRandomJokeByCategory(category: String) = apiService.getRandomJokeByCategory(category)
}

