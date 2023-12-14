package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Score(
    @SerializedName("r1")
    val r1: Double = 0.0, // 5.26
    @SerializedName("r2")
    val r2: Int = 0, // 0
    @SerializedName("r3")
    val r3: Double = 0.0, // 5.26
    @SerializedName("r4")
    val r4: Double = 0.0, // 1.96
    @SerializedName("r5")
    val r5: Double = 0.0 // 98.04
)