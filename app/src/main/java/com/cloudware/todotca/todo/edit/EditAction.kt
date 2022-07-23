package com.cloudware.todotca.todo.edit

sealed class EditAction {
    data class TitleChanged(val title: String) : EditAction()
    data class DescriptionChanged(val description: String) : EditAction()
    object CloseTapped : EditAction()
    object SaveTapped : EditAction()
    object Saved : EditAction()
}
