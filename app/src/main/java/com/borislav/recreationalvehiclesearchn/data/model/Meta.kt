package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("city")
    val city: String = "", // Atlanta
    @SerializedName("country")
    val country: String = "", // US
    @SerializedName("country_code")
    val countryCode: String = "", // US
    @SerializedName("country_name")
    val countryName: String = "", // United States
    @SerializedName("experiments")
    val experiments: Experiments = Experiments(),
    @SerializedName("experiments_data")
    val experimentsData: ExperimentsData = ExperimentsData(),
    @SerializedName("flexible_dates")
    val flexibleDates: Any? = null, // null
    @SerializedName("is_blended")
    val isBlended: Boolean = false, // false
    @SerializedName("lat")
    val lat: Double = 0.0, // 33.7485
    @SerializedName("lng")
    val lng: Double = 0.0, // -84.3871
    @SerializedName("locale")
    val locale: String = "", // en-us
    @SerializedName("price_average")
    val priceAverage: Int = 0, // 22483
    @SerializedName("price_histogram")
    val priceHistogram: PriceHistogram = PriceHistogram(),
    @SerializedName("price_max")
    val priceMax: Int = 0, // 500000
    @SerializedName("price_median")
    val priceMedian: Int = 0, // 13000
    @SerializedName("price_min")
    val priceMin: Int = 0, // 3000
    @SerializedName("radius")
    val radius: Int = 0, // 100
    @SerializedName("request")
    val request: Request = Request(),
    @SerializedName("start_position")
    val startPosition: Int = 0, // 1
    @SerializedName("state")
    val state: String = "", // GA
    @SerializedName("stop_position")
    val stopPosition: Int = 0, // 25
    @SerializedName("suggested")
    val suggested: Boolean = false, // false
    @SerializedName("total")
    val total: Int = 0, // 1000
    @SerializedName("total_unavailable")
    val totalUnavailable: Int = 0, // 0
    @SerializedName("vehicle_types")
    val vehicleTypes: List<VehicleType> = listOf()
)