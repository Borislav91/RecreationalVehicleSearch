package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Rental(
    @SerializedName("key")
    val key: String = "", // cleanlinessScore
    @SerializedName("name")
    val name: String = "",
    @SerializedName("percentage")
    val percentage: Double = 0.0, // 96.92307692307692
    @SerializedName("score")
    val score: Double = 0.0 // 4.846153846153846
)