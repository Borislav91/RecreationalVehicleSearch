package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class ActiveOptions(
    @SerializedName("cancel_policy")
    val cancelPolicy: String = "", // flexible
    @SerializedName("cancel_policy_combo_bookings")
    val cancelPolicyComboBookings: String = "",
    @SerializedName("date")
    val date: String = "", // 2023-12-14
    @SerializedName("instant_book")
    val instantBook: Boolean = false, // true
    @SerializedName("minimum_days")
    val minimumDays: Int = 0, // 1
    @SerializedName("monthly_discount_percentage")
    val monthlyDiscountPercentage: Double = 0.0, // 19.9
    @SerializedName("monthly_rate_per_day")
    val monthlyRatePerDay: Int = 0, // 38800
    @SerializedName("price_per_day")
    val pricePerDay: Int = 0, // 48500
    @SerializedName("price_per_month")
    val pricePerMonth: Int = 0, // 1086400
    @SerializedName("price_per_week")
    val pricePerWeek: Int = 0, // 288575
    @SerializedName("tax")
    val tax: Int = 0, // 0
    @SerializedName("use_day_pricing")
    val useDayPricing: Boolean = false, // false
    @SerializedName("use_tax_inclusive_pricing")
    val useTaxInclusivePricing: Boolean = false, // false
    @SerializedName("weekly_discount_percentage")
    val weeklyDiscountPercentage: Double = 0.0, // 14.2
    @SerializedName("weekly_rate_per_day")
    val weeklyRatePerDay: Int = 0 // 41225
)