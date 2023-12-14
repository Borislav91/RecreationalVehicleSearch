package com.example.draftoutdoorsycodechallenge.data.model


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("generator_usage_item")
    val generatorUsageItem: GeneratorUsageItem? = GeneratorUsageItem(),
    @SerializedName("images")
    val images: Images = Images(),
    @SerializedName("mileage_usage_item")
    val mileageUsageItem: MileageUsageItem? = MileageUsageItem(),
    @SerializedName("owner")
    val owner: OwnerX = OwnerX(),
    @SerializedName("primary_image")
    val primaryImage: PrimaryImage = PrimaryImage()
)