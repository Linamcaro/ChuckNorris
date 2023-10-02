package com.example.test.repository

import com.example.test.model.APIService

class JokesRepository (private val apiService: APIService) {

    suspend fun getMovies(page: Int, limit: Int) = apiService.getCategory()
}

