package com.cloudware.todotca.core.app

sealed class AppDestination(val route: String) {
    object List : AppDestination("list")
    object Add : AppDestination("add")
}
