package com.cloudware.todotca.todo.data

import com.toggl.komposable.architecture.Subscription
import com.cloudware.todotca.core.app.AppAction
import com.cloudware.todotca.core.app.AppState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserSubscription @Inject constructor(private val accountManager: AccountManager) : Subscription<AppState, AppAction> {
    override fun subscribe(state: Flow<AppState>): Flow<AppAction> =
        accountManager.getLoggedInUser().map { AppAction.IdentityUpdated(it) }
}
