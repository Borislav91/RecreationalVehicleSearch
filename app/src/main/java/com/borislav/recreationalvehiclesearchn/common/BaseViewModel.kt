package com.borislav.recreationalvehiclesearchn.common

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

abstract class BaseViewModel<ScreenState : Any, Action, Event>(
    initialState: ScreenState
) : ViewModel() {

    // MutableStateFlow to hold and emit state updates. It's initialized with the initial state.
    @PublishedApi
    internal val mState: MutableStateFlow<ScreenState> = MutableStateFlow(initialState)
    // StateFlow to expose the immutable state outside the ViewModel.
    val state: StateFlow<ScreenState> = mState.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5000),
        initialValue = initialState
    )

    // MutableSharedFlow to handle actions that can alter the state.
    private val actions = MutableSharedFlow<Action>()

    // Channel to handle one-time events separate from the state.
    private val _events = Channel<Event>(Channel.BUFFERED)
    val events = _events.receiveAsFlow()

    // Function to submit events to the event channel.
    fun submitEvent(event: Event) {
        viewModelScope.launch { _events.send(event) }
    }

    // Initializer to start collecting actions on ViewModel creation.
    init {
        collectActions()
    }

    // Open function to be overridden for handling actions.
    open suspend fun handleActions(action: Action) {

    }

    // Function to collect and process actions.
    private fun collectActions() = viewModelScope.launch {
        actions.collect { handleActions(it) }
    }

    // Function to submit actions, which are then processed by collectActions.
    val submitAction: (action: Action) -> Unit = {
        viewModelScope.launch { actions.emit(it) }
    }

    // Inline function to update the state in a thread-safe manner.
    inline fun updateState(crossinline function: ScreenState.() -> ScreenState) {
        mState.update(function)
    }
}