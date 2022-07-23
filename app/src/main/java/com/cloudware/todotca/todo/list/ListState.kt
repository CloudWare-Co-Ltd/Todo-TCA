package com.cloudware.todotca.todo.list

import com.cloudware.todotca.core.app.BackStack
import com.cloudware.todotca.core.app.BackStackAwareState
import com.cloudware.todotca.todo.data.TodoItem

data class ListState(
    val todoList: List<TodoItem>,
    override val backStack: BackStack,
) : BackStackAwareState<ListState> {
    override fun changeBackStack(backStack: BackStack): ListState =
        copy(backStack = backStack)
}
