package com.example.test.data

import com.example.test.Constants
import com.example.test.model.APIService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object AppModule {

    fun provideRetrofitInstance(BASE_URL : String): APIService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(APIService::class.java)
    }
}