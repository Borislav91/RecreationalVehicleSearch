package com.borislav.recreationalvehiclesearchn.data.repository

import com.borislav.recreationalvehiclesearchn.domain.repository.OutdoorsyApiService
import com.example.draftoutdoorsycodechallenge.data.model.ApiResponse
import retrofit2.Response
import javax.inject.Inject

private const val TAG = "OutdoorsyApiServiceImpl"

class OutdoorsyApiServiceImpl @Inject constructor(
    private val apiService: OutdoorsyApiService
) : OutdoorsyApiService {

    override suspend fun searchRentalListings(
        searchedRv: String,
        limit: Int?,
        offset: Int?
    ): Response<ApiResponse> {
        return apiService.searchRentalListings(searchedRv, limit, offset)
    }
}