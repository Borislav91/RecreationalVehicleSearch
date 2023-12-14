package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class SeoContent(
    @SerializedName("category")
    val category: List<Category> = listOf()
)