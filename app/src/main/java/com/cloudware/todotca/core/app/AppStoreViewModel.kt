package com.cloudware.todotca.core.app

import androidx.lifecycle.ViewModel
import com.cloudware.todotca.core.extensions.ViewStateProvider
import com.toggl.komposable.architecture.Store
import com.cloudware.todotca.todo.data.Identity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class AppStoreViewModel @Inject constructor(
    store: Store<AppState, AppAction>
) : ViewModel(), ViewStateProvider<AppViewState>, Store<AppState, AppAction> by store {
    override val viewState: Flow<AppViewState> = state.map { AppViewState(it.identity, it.backStack) }
    override val initialViewState: AppViewState = AppViewState()
}

data class AppViewState(
    val identity: Identity = Identity.Unknown,
    val backStack: BackStack = listOf(AppDestination.List),
)
