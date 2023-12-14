package com.borislav.recreationalvehiclesearchn.data.repository

import com.borislav.recreationalvehiclesearchn.data.mapper.toDomain
import com.borislav.recreationalvehiclesearchn.domain.model.VehicleListing
import com.borislav.recreationalvehiclesearchn.domain.repository.OutdoorsyApiService
import com.borislav.recreationalvehiclesearchn.domain.repository.VehicleListingRepository
import javax.inject.Inject

class VehicleListingRepositoryImpl @Inject constructor(
    private val apiService: OutdoorsyApiService
) : VehicleListingRepository {

    // Implementation of searchRentalListings from VehicleListingRepository interface.
    // This function makes an API call to fetch rental listings based on the provided search criteria.
    override suspend fun searchRentalListings(searchedRv: String, limit: Int?, offset: Int?): List<VehicleListing> {
        // Invokes the searchRentalListings API method and stores the response.
        val response = apiService.searchRentalListings(searchedRv, limit, offset)
        if (response.isSuccessful) {
            // Converts the successful response body to a domain model list, or returns an empty list if null.
            return response.body()?.toDomain() ?: emptyList()
        } else {
            throw Exception("API call failed with error: ${response.errorBody()?.string()}")
        }
    }
}