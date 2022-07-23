package com.cloudware.todotca.todo.list

import com.toggl.komposable.architecture.Subscription
import com.cloudware.todotca.core.app.AppAction
import com.cloudware.todotca.core.app.AppState
import com.cloudware.todotca.todo.data.TodoDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ListSubscription @Inject constructor(private val todoDao: TodoDao) : Subscription<AppState, AppAction> {
    override fun subscribe(state: Flow<AppState>): Flow<AppAction> =
        todoDao.getAll().map { AppAction.List(ListAction.ListUpdated(it)) }
}
