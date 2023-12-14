package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class Features(
    @SerializedName("air_conditioner")
    val airConditioner: Boolean = false, // true
    @SerializedName("audio_inputs")
    val audioInputs: Boolean = false, // true
    @SerializedName("awning")
    val awning: Boolean = false, // false
    @SerializedName("backup_camera")
    val backupCamera: Boolean = false, // true
    @SerializedName("base_weight")
    val baseWeight: Int? = null, // 0
    @SerializedName("beds_bunk")
    val bedsBunk: Int? = null, // 1
    @SerializedName("beds_dinette_conversion")
    val bedsDinetteConversion: Int? = null, // 1
    @SerializedName("beds_fold_out_sofa")
    val bedsFoldOutSofa: Int? = null, // 1
    @SerializedName("beds_full")
    val bedsFull: Int = 0, // 0
    @SerializedName("beds_king")
    val bedsKing: Int = 0, // 0
    @SerializedName("beds_other")
    val bedsOther: Int? = null, // 1
    @SerializedName("beds_queen")
    val bedsQueen: Int = 0, // 0
    @SerializedName("beds_twin")
    val bedsTwin: Int = 0, // 0
    @SerializedName("bike_rack")
    val bikeRack: Boolean = false, // true
    @SerializedName("brake_controller")
    val brakeController: Boolean = false, // false
    @SerializedName("burning_man_friendly")
    val burningManFriendly: Boolean = false, // false
    @SerializedName("carrying_capacity")
    val carryingCapacity: Int? = null, // 0
    @SerializedName("cd_player")
    val cdPlayer: Boolean = false, // false
    @SerializedName("ceiling_fan")
    val ceilingFan: Boolean = false, // false
    @SerializedName("connector_type")
    val connectorType: String? = null, // 7pin
    @SerializedName("dining_table")
    val diningTable: Boolean = false, // false
    @SerializedName("extra_storage")
    val extraStorage: Boolean = false, // true
    @SerializedName("festival_friendly")
    val festivalFriendly: Boolean = false, // false
    @SerializedName("fuel_tank")
    val fuelTank: Int? = null, // 0
    @SerializedName("fuel_type")
    val fuelType: String? = null, // diesel
    @SerializedName("generator")
    val generator: Boolean = false, // true
    @SerializedName("gray_tank")
    val grayTank: Int = 0, // 0
    @SerializedName("gross_vehicle_weight")
    val grossVehicleWeight: Int? = null, // 0
    @SerializedName("handicap_accessible")
    val handicapAccessible: Boolean = false, // false
    @SerializedName("heater")
    val heater: Boolean = false, // true
    @SerializedName("hitch_weight")
    val hitchWeight: Int? = null, // 0
    @SerializedName("hookup_electric")
    val hookupElectric: Boolean? = null, // false
    @SerializedName("hookup_sewer")
    val hookupSewer: Boolean? = null, // false
    @SerializedName("hookup_water")
    val hookupWater: Boolean? = null, // false
    @SerializedName("hot_water_tank")
    val hotWaterTank: Boolean = false, // false
    @SerializedName("inside_shower")
    val insideShower: Boolean = false, // false
    @SerializedName("international_travel_allowed")
    val internationalTravelAllowed: Boolean? = null, // false
    @SerializedName("inverter")
    val inverter: Boolean = false, // true
    @SerializedName("kitchen_sink")
    val kitchenSink: Boolean = false, // true
    @SerializedName("leveling_jacks")
    val levelingJacks: Boolean = false, // false
    @SerializedName("microwave")
    val microwave: Boolean = false, // true
    @SerializedName("minimum_age")
    val minimumAge: Int = 0, // 0
    @SerializedName("mpg")
    val mpg: Int = 0, // 0
    @SerializedName("one_way_rentals")
    val oneWayRentals: Boolean = false, // false
    @SerializedName("outside_shower")
    val outsideShower: Boolean = false, // false
    @SerializedName("oven")
    val oven: Boolean = false, // false
    @SerializedName("pet_friendly")
    val petFriendly: Boolean = false, // true
    @SerializedName("propane_tank")
    val propaneTank: Double = 0.0, // 12.2
    @SerializedName("provides_receivers")
    val providesReceivers: Boolean = false, // false
    @SerializedName("radio")
    val radio: Boolean = false, // true
    @SerializedName("refrigerator")
    val refrigerator: Boolean = false, // true
    @SerializedName("satellite")
    val satellite: Boolean = false, // false
    @SerializedName("sewage_tank")
    val sewageTank: Double = 0.0, // 24.5
    @SerializedName("skylight")
    val skylight: Boolean = false, // true
    @SerializedName("slide_outs")
    val slideOuts: Int = 0, // 0
    @SerializedName("smoking_allowed")
    val smokingAllowed: Boolean = false, // false
    @SerializedName("solar")
    val solar: Boolean = false, // false
    @SerializedName("stove")
    val stove: Boolean = false, // false
    @SerializedName("tailgate_friendly")
    val tailgateFriendly: Boolean = false, // true
    @SerializedName("toilet")
    val toilet: Boolean = false, // true
    @SerializedName("tow_hitch")
    val towHitch: Boolean = false, // false
    @SerializedName("trailer_weight")
    val trailerWeight: Int? = null, // 0
    @SerializedName("transmission")
    val transmission: String? = null, // automatic
    @SerializedName("tv_dvd")
    val tvDvd: Boolean = false, // true
    @SerializedName("washer_dryer")
    val washerDryer: Boolean = false, // false
    @SerializedName("water_tank")
    val waterTank: Int = 0, // 0
    @SerializedName("wifi")
    val wifi: Boolean = false // true
)