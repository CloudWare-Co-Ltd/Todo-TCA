package com.cloudware.todotca.todo.edit

import com.cloudware.todotca.core.app.BackStack
import com.cloudware.todotca.core.app.BackStackAwareState
import com.cloudware.todotca.todo.data.EditableTodoItem

data class EditState(
    val editableTodo: EditableTodoItem = EditableTodoItem(title = "", description = ""),
    override val backStack: BackStack
) : BackStackAwareState<EditState> {
    override fun changeBackStack(backStack: BackStack): EditState =
        copy(backStack = backStack)
}
