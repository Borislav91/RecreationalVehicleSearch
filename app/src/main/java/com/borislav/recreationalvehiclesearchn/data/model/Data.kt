package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("attributes")
    val attributes: Attributes = Attributes(),
    @SerializedName("id")
    val id: String = "", // 357465
    @SerializedName("relationships")
    val relationships: Relationships = Relationships(),
    @SerializedName("type")
    val type: String = "" // rentals
)