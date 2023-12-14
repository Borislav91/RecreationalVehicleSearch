package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class PriceHistogram(
    @SerializedName("data")
    val `data`: List<Int> = listOf(),
    @SerializedName("max_value")
    val maxValue: Int = 0 // 50000
)