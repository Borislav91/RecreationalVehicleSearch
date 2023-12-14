package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class VehicleType(
    @SerializedName("label")
    val label: String = "", // Other
    @SerializedName("style")
    val style: String = "", // both
    @SerializedName("type")
    val type: String = "" // other
)