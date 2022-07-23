package com.cloudware.todotca.todo.list

import com.cloudware.todotca.todo.data.TodoItem

sealed class ListAction {
    data class ListUpdated(val todoList: List<TodoItem>) : ListAction()
    object AddTodoTapped : ListAction()
}
