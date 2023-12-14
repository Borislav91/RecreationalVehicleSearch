package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class AttributesX(
    @SerializedName("amenity")
    val amenity: Any? = Any(), // null
    @SerializedName("best")
    val best: Boolean = false, // false
    @SerializedName("category")
    val category: CategoryX = CategoryX(),
    @SerializedName("description")
    val description: String = "",
    @SerializedName("position")
    val position: Int = 0, // 1
    @SerializedName("primary")
    val primary: Boolean = false, // true
    @SerializedName("rental_id")
    val rentalId: Int = 0, // 357465
    @SerializedName("review")
    val review: Any? = Any(), // null
    @SerializedName("skip_enhance")
    val skipEnhance: Boolean = false, // false
    @SerializedName("status")
    val status: String = "", // approved
    @SerializedName("tags")
    val tags: String = "",
    @SerializedName("url")
    val url: String = "", // https://res.cloudinary.com/outdoorsy/image/upload/v1682866075/p/rentals/357465/images/cgjtw1ryiiq0tonlm5zd.jpg
    @SerializedName("video")
    val video: Boolean = false // false
)