package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Locale(
    @SerializedName("base_currency")
    val baseCurrency: String = "", // USD
    @SerializedName("distance_unit")
    val distanceUnit: String = "", // miles
    @SerializedName("length_unit")
    val lengthUnit: String = "", // feet
    @SerializedName("liquid_unit")
    val liquidUnit: String = "", // gallons
    @SerializedName("weight_unit")
    val weightUnit: String = "" // lbs
)