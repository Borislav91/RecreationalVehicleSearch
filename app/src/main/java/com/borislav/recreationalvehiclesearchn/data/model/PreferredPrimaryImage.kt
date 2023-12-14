package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class PreferredPrimaryImage(
    @SerializedName("amenity")
    val amenity: Any? = null, // null
    @SerializedName("best")
    val best: Boolean = false, // false
    @SerializedName("category")
    val category: Any? = null, // null
    @SerializedName("description")
    val description: String = "",
    @SerializedName("position")
    val position: Int = 0, // 0
    @SerializedName("primary")
    val primary: Boolean = false, // false
    @SerializedName("rental_id")
    val rentalId: Int = 0, // 0
    @SerializedName("review")
    val review: Any? = null, // null
    @SerializedName("skip_enhance")
    val skipEnhance: Boolean = false, // false
    @SerializedName("status")
    val status: String = "",
    @SerializedName("tags")
    val tags: String = "",
    @SerializedName("url")
    val url: String = "",
    @SerializedName("video")
    val video: Boolean = false // false
)