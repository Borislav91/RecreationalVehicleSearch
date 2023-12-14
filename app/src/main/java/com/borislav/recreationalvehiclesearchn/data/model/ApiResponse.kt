package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    @SerializedName("data")
    val `data`: List<Data> = listOf(),
    @SerializedName("included")
    val included: List<Included> = listOf(),
    @SerializedName("meta")
    val meta: Meta = Meta(),
    @SerializedName("suggestions")
    val suggestions: Any? = Any() // null
)