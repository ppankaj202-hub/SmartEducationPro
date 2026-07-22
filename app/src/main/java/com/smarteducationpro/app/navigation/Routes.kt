package com.smarteducationpro.app.navigation

sealed class Screen(val route: String) {

    data object Splash : Screen("splash")

    data object Language : Screen("language")

    data object Board : Screen("board")

    data object Medium : Screen("medium")

    data object ClassSelection : Screen("class")

    data object Login : Screen("login")

    data object Subscription : Screen("subscription")

    data object Home : Screen("home")

    data object Profile : Screen("profile")
}