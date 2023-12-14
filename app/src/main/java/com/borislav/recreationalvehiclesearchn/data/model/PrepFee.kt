package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class PrepFee(
    @SerializedName("amount")
    val amount: Int = 0, // 10000
    @SerializedName("description")
    val description: String = "" // This fee will cover washing, cleaning, and preparing the RV prior to each rental.
)