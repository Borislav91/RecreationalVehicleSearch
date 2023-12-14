package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class TaxRate(
    @SerializedName("id")
    val id: Int = 0, // 11853
    @SerializedName("rate")
    val rate: Int = 0 // 7
)