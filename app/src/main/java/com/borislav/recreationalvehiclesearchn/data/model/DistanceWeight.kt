package com.borislav.recreationalvehiclesearchn.data.mode

import com.google.gson.annotations.SerializedName

data class DistanceWeight(
    @SerializedName("control")
    val control: Double = 0.0, // 0.35
    @SerializedName("test_1")
    val test1: Double = 0.0, // 0.6
    @SerializedName("test_2")
    val test2: Double = 0.0, // 0.35
    @SerializedName("test_3")
    val test3: Double = 0.0 // 0.35
)