package com.borislav.recreationalvehiclesearchn.ui

import com.borislav.recreationalvehiclesearchn.common.BaseViewModel
import com.borislav.recreationalvehiclesearchn.domain.usecase.SearchRentalListingsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import timber.log.Timber
import javax.inject.Inject

private const val TAG = "OutdoorsyListingsViewModel"
@HiltViewModel
class OutdoorsyListingsViewModel
@Inject constructor(
    private val searchRentalListingsUseCase: SearchRentalListingsUseCase
) : BaseViewModel<OutdoorsyListingsState, OutdoorsyListingsAction, Unit>(OutdoorsyListingsState()){

    // Handles actions defined in the OutdoorsyListingsAction sealed class.
    override suspend fun handleActions(action: OutdoorsyListingsAction) {
        when (action) {
            is OutdoorsyListingsAction.OnSearchRv -> searchRVRentals(action.query)
        }
    }


    // Searches RV rentals using the provided query and updates the state with results.
    private suspend fun searchRVRentals(query: String) {
        Timber.tag(TAG).d("Searching RV rentals with query: $query")
        searchRentalListingsUseCase(query).let { listings ->
            updateState {
                copy(
                    searchResults = listings
                )
            }
        }
    }
}