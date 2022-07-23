package com.cloudware.todotca.todo.list

import com.toggl.komposable.architecture.Effect
import com.toggl.komposable.architecture.Mutable
import com.toggl.komposable.architecture.Reducer
import com.toggl.komposable.extensions.mutateWithoutEffects
import com.cloudware.todotca.core.app.AppDestination
import com.cloudware.todotca.core.app.push
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ListReducer @Inject constructor() : Reducer<ListState, ListAction> {
    override fun reduce(state: Mutable<ListState>, action: ListAction): List<Effect<ListAction>> =
        when (action) {
            is ListAction.ListUpdated -> state.mutateWithoutEffects { copy(todoList = action.todoList) }
            ListAction.AddTodoTapped -> state.mutateWithoutEffects { copy(backStack = backStack.push(
                AppDestination.Add)) }
        }
}
