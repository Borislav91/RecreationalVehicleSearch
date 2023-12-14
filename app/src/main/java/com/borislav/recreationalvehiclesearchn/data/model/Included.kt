package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Included(
    @SerializedName("attributes")
    val attributes: AttributesX = AttributesX(),
    @SerializedName("id")
    val id: String = "", // 3000339
    @SerializedName("type")
    val type: String = "" // images
)