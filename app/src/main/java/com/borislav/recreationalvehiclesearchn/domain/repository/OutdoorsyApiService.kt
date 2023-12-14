package com.borislav.recreationalvehiclesearchn.domain.repository

import com.borislav.recreationalvehiclesearchn.data.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface OutdoorsyApiService {
    // Defines a GET request method for the Outdoorsy API.
    // The method fetches rental listings based on search criteria.
    // @GET(".") indicates that the endpoint URL is defined in the Retrofit base URL.
    @GET(".")
    suspend fun searchRentalListings(
        // @Query parameters define the query strings to be added to the URL.
        // 'searchedRv' represents keywords to filter the search results.
        @Query("filter[keywords]") searchedRv: String,
        // 'limit' represents the maximum number of results to be returned.
        @Query("page[limit]") limit: Int? = null,
        // 'offset' represents the index from where to start the results.
        @Query("page[offset]") offset: Int? = null
    ): Response<ApiResponse>
}