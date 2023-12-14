package com.borislav.recreationalvehiclesearchn.data.model

import com.borislav.recreationalvehiclesearchn.data.mode.DataX
import com.google.gson.annotations.SerializedName

data class GeneratorUsageItem(
    @SerializedName("data")
    val `data`: DataX = DataX()
)