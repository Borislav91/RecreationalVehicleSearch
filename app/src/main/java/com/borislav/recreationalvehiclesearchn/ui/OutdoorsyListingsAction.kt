package com.borislav.recreationalvehiclesearchn.ui

sealed class OutdoorsyListingsAction {
    data class OnSearchRv(val query: String) : OutdoorsyListingsAction()
}