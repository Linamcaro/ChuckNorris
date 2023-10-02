package com.example.test.model

import com.example.test.Constants
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET(Constants.End_Point_JokeByCategory)
    suspend fun getRandomJokeByCategory(@Query("category") category: String): Response<ChuckNorris>

    @GET(Constants.End_Point_Categories)
    suspend fun getCategory(): Response<CategorieResponse>


}