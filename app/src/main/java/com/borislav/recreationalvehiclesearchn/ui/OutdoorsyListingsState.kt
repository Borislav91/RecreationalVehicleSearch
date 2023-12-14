package com.borislav.recreationalvehiclesearchn.ui

import com.borislav.recreationalvehiclesearchn.domain.model.VehicleListing

private const val TAG = "OutdoorsyListingsState"

data class OutdoorsyListingsState (
    val query: String = "",
    val searchResults: List<VehicleListing>? = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)