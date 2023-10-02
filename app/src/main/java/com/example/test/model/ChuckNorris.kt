package com.example.test.model

import java.io.Serializable

data class ChuckNorris(
    val icon_url: String,
    val id: String,
    val url: String,
    val value: String
): Serializable