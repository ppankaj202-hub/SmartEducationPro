package com.smarteducationpro.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.smarteducationpro.app.feature.board.BoardScreen
import com.smarteducationpro.app.feature.classselection.ClassSelectionScreen
import com.smarteducationpro.app.feature.language.LanguageScreen
import com.smarteducationpro.app.feature.login.LoginScreen
import com.smarteducationpro.app.feature.medium.MediumScreen
import com.smarteducationpro.app.feature.splash.SplashScreen
import com.smarteducationpro.app.feature.home.HomeScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        // Splash
        composable(Screen.Splash.route) {
            SplashScreen(
                onNavigate = {
                    navController.navigate(Screen.Language.route) {
                        popUpTo(Screen.Splash.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }

        // Language
        composable(Screen.Language.route) {
            LanguageScreen(
                onContinue = {
                    navController.navigate(Screen.Board.route)
                }
            )
        }

        // Board
        composable(Screen.Board.route) {
            BoardScreen(
                onContinue = {
                    navController.navigate(Screen.Medium.route)
                }
            )
        }

        // Medium
        composable(Screen.Medium.route) {
            MediumScreen(
                onContinue = {
                    navController.navigate(Screen.ClassSelection.route)
                }
            )
        }

        // Class Selection
        composable(Screen.ClassSelection.route) {
            ClassSelectionScreen(
                onContinue = {
                    navController.navigate(Screen.Login.route)
                }
            )
        }

        // Login
        composable(Screen.Login.route) {
            LoginScreen(
                onContinue = {
                    navController.navigate(Screen.Home.route)
                }
            )
        }

        composable(Screen.Home.route) {

    HomeScreen()

}

    }





}