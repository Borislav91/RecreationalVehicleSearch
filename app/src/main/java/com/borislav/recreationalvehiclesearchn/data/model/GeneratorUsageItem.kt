package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class GeneratorUsageItem(
    @SerializedName("data")
    val `data`: DataX = DataX()
)