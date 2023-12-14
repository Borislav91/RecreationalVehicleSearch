package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class DistributedRatings(
    @SerializedName("score")
    val score: Score = Score()
)