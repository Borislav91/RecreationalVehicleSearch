package com.borislav.recreationalvehiclesearchn.domain.usecase

import com.borislav.recreationalvehiclesearchn.domain.model.VehicleListing
import com.borislav.recreationalvehiclesearchn.domain.repository.VehicleListingRepository
import javax.inject.Inject

private const val TAG = "SearchRentalListingsUseCase"


class SearchRentalListingsUseCase @Inject constructor(
    private val vehicleListingRepository: VehicleListingRepository
) {
    // Default values for maximum results and offset in search queries.
    private val requestedMaximumResult = 8
    private val requestedOffset = 16

    // Function to search rental listings. It can be invoked like a regular function thanks to 'operator fun invoke'.
    suspend operator fun invoke(
        searchedRv: String,
        limit: Int? = requestedMaximumResult,
        offset: Int? = requestedOffset
    ): List<VehicleListing> {
        return try {
            // Fetches rental listings from the repository with specified search parameters.
            vehicleListingRepository.searchRentalListings(searchedRv, limit, offset)
        } catch (e: Exception) {
            emptyList<VehicleListing>()
        }
    }
}