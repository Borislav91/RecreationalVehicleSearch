package com.borislav.recreationalvehiclesearchn.data.model

import com.borislav.recreationalvehiclesearchn.data.mode.DataXX
import com.google.gson.annotations.SerializedName

data class PrimaryImage(
    @SerializedName("data")
    val `data`: DataXX = DataXX()
)