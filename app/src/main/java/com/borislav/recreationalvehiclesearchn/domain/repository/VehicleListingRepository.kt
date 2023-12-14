package com.borislav.recreationalvehiclesearchn.domain.repository

import com.borislav.recreationalvehiclesearchn.domain.model.VehicleListing

interface VehicleListingRepository {
    suspend fun searchRentalListings(searchedRv: String, limit: Int?, offset: Int?): List<VehicleListing>
}