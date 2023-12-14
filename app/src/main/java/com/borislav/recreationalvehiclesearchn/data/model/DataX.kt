package com.borislav.recreationalvehiclesearchn.data.mode

import com.google.gson.annotations.SerializedName

data class DataX(
    @SerializedName("id")
    val id: String = "", // 450001
    @SerializedName("type")
    val type: String = "" // usage_based_item
)