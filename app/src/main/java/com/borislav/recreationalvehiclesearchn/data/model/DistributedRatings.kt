package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class DistributedRatings(
    @SerializedName("score")
    val score: Score = Score()
)