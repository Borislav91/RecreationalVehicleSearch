package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class CategoryX(
    @SerializedName("name")
    val name: String = "",
    @SerializedName("slug")
    val slug: String = "" // other
)