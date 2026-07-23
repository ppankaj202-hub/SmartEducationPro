package com.smarteducationpro.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.smarteducationpro.app.feature.board.BoardScreen
import com.smarteducationpro.app.feature.language.LanguageScreen
import com.smarteducationpro.app.feature.medium.MediumScreen
import com.smarteducationpro.app.feature.splash.SplashScreen
import com.smarteducationpro.app.feature.classselection.ClassSelectionScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        composable(Screen.Splash.route) {
            SplashScreen()
        }

        composable(Screen.Language.route) {
            LanguageScreen(
                onContinue = {
                    navController.navigate(Screen.Board.route)
                }
            )
        }

        composable(Screen.Board.route) {
            BoardScreen(
                onContinue = {
                    navController.navigate(Screen.Medium.route)
                }
            )
        }

        composable(Screen.Medium.route) {
            MediumScreen(
                onContinue = {
                    navController.navigate(Screen.ClassSelection.route)
                }
            )
        }

composable(Screen.ClassSelection.route) {
    ClassSelectionScreen(
        onContinue = {
            navController.navigate(Screen.Login.route)
        }
    )
}
    }
}