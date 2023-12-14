package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class AverageRatings(
    @SerializedName("cleanliness_score")
    val cleanlinessScore: Double = 0.0, // 4.86
    @SerializedName("cleanliness_score_percentage")
    val cleanlinessScorePercentage: Double = 0.0, // 97.14
    @SerializedName("communication_score")
    val communicationScore: Double = 0.0, // 4.43
    @SerializedName("communication_score_percentage")
    val communicationScorePercentage: Double = 0.0, // 88.57
    @SerializedName("listing_score")
    val listingScore: Double = 0.0, // 4.8
    @SerializedName("listing_score_percentage")
    val listingScorePercentage: Double = 0.0, // 98.57
    @SerializedName("mechanical_score")
    val mechanicalScore: Double = 0.0, // 4.64
    @SerializedName("mechanical_score_percentage")
    val mechanicalScorePercentage: Double = 0.0, // 92.86
    @SerializedName("score")
    val score: Double = 0.0, // 4.98
    @SerializedName("score_percentage")
    val scorePercentage: Double = 0.0, // 99.61
    @SerializedName("value_score")
    val valueScore: Double = 0.0, // 4.93
    @SerializedName("value_score_percentage")
    val valueScorePercentage: Double = 0.0 // 98.57
)