package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("key")
    val key: String = "", // communicationScore
    @SerializedName("name")
    val name: String = "",
    @SerializedName("percentage")
    val percentage: Double = 0.0, // 95.71428571428571
    @SerializedName("score")
    val score: Double = 0.0 // 4.785714285714286
)