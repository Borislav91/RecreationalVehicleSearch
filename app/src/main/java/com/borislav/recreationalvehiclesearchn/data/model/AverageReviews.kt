package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class AverageReviews(
    @SerializedName("owner")
    val owner: List<Owner> = listOf(),
    @SerializedName("rental")
    val rental: List<Rental> = listOf(),
    @SerializedName("score")
    val score: Double = 0.0 // 4.96
)