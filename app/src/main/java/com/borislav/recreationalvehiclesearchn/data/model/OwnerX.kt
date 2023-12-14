package com.borislav.recreationalvehiclesearchn.data.model

import com.borislav.recreationalvehiclesearchn.data.mode.DataXXXX
import com.google.gson.annotations.SerializedName

data class OwnerX(
    @SerializedName("data")
    val `data`: DataXXXX = DataXXXX()
)