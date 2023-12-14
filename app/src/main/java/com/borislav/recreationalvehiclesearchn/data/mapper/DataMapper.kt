package com.borislav.recreationalvehiclesearchn.data.mapper

import com.borislav.recreationalvehiclesearchn.domain.model.VehicleListing
import com.example.draftoutdoorsycodechallenge.data.model.ApiResponse
import com.example.draftoutdoorsycodechallenge.data.model.Data
import com.example.draftoutdoorsycodechallenge.data.model.Included

// Extension function to convert ApiResponse to a list of VehicleListing.
// It transforms each 'Data' object within the 'data' list of ApiResponse into a VehicleListing.
internal fun ApiResponse.toDomain(): List<VehicleListing> {
    return this.data.map { it.toVehicleListing(this.included) }
}

// Extension function to convert 'Data' (a part of ApiResponse) into VehicleListing.
// It finds the corresponding image URL in the 'included' list based on the primary image ID
// and constructs a VehicleListing object with the ID, name, and image URL.
internal fun Data.toVehicleListing(included: List<Included>): VehicleListing {
    val imageUrl = included.find { it.id == this.relationships.primaryImage.data.id }?.attributes?.url
    return VehicleListing(
        id = this.id,
        name = this.attributes.name,
        imageUrl = imageUrl
    )
}