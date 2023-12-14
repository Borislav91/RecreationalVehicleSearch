package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class Category(
    @SerializedName("id")
    val id: Int = 0, // 199679
    @SerializedName("title")
    val title: String = "", // Ford RV rental by model
    @SerializedName("url")
    val url: String = "" // https://www.outdoorsy.com/rv-makes-types/ford-m
)