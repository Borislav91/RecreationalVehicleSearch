package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class Ranking(
    @SerializedName("distance_weight")
    val distanceWeight: DistanceWeight = DistanceWeight(),
    @SerializedName("distance_weight_prod")
    val distanceWeightProd: Double = 0.0, // 0.35
    @SerializedName("is_new_listing")
    val isNewListing: Int = 0, // 0
    @SerializedName("model_name")
    val modelName: String = "", // model_gbt_web_072522
    @SerializedName("original_score")
    val originalScore: Int = 0, // 0
    @SerializedName("ranking_score")
    val rankingScore: Double = 0.0, // 0.9139
    @SerializedName("ranking_score2")
    val rankingScore2: Double = 0.0, // 0.5507
    @SerializedName("ranking_score3")
    val rankingScore3: Double = 0.0 // 0.9139
)