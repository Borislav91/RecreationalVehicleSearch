package com.borislav.recreationalvehiclesearchn.data.model

import com.google.gson.annotations.SerializedName

data class InsurancePlan(
    @SerializedName("id")
    val id: Int = 0, // 96
    @SerializedName("label")
    val label: String = "", // Outdoorsy Drivable Protection
    @SerializedName("renter_body")
    val renterBody: String = "",
    @SerializedName("renter_headline")
    val renterHeadline: String = "",
    @SerializedName("requires_driver_verification")
    val requiresDriverVerification: Boolean = false // false
)