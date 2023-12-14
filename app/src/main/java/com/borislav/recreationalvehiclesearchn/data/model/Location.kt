package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class Location(
    @SerializedName("city")
    val city: String = "", // Norcross
    @SerializedName("country")
    val country: String = "", // US
    @SerializedName("county")
    val county: String = "",
    @SerializedName("lat")
    val lat: Double = 0.0, // 33.966
    @SerializedName("lng")
    val lng: Double = 0.0, // -84.226
    @SerializedName("state")
    val state: String = "", // GA
    @SerializedName("zip")
    val zip: String = "" // 30092
)