package com.example.test.model

data class JokeResponse(
    val categories: List<CategoriesResponse>,
    val created_at: String,
    val icon_url: String,
    val id: String,
    val updated_at: String,
    val url: String,
    val value: String
)