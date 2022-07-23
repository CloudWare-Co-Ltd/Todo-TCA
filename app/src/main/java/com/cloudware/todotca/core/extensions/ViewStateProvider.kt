package com.cloudware.todotca.core.extensions

import kotlinx.coroutines.flow.Flow

interface ViewStateProvider<ViewState> {
    val viewState: Flow<ViewState>
    val initialViewState: ViewState
}
