package com.smarteducationpro.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.smarteducationpro.app.feature.board.BoardScreen
import com.smarteducationpro.app.feature.classselection.ClassSelectionScreen
import com.smarteducationpro.app.feature.language.LanguageScreen
import com.smarteducationpro.app.feature.medium.MediumScreen
import com.smarteducationpro.app.feature.splash.SplashScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {

        // Splash Screen
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

        // Language Screen
        composable(Screen.Language.route) {

            LanguageScreen(

                onContinue = {

                    navController.navigate(Screen.Board.route)

                }

            )

        }

        // Board Screen
        composable(Screen.Board.route) {

            BoardScreen(

                onContinue = {

                    navController.navigate(Screen.Medium.route)

                }

            )

        }

        // Medium Screen
        composable(Screen.Medium.route) {

            MediumScreen(

                onContinue = {

                    navController.navigate(Screen.ClassSelection.route)

                }

            )

        }

        // Class Selection Screen
        composable(Screen.ClassSelection.route) {

            ClassSelectionScreen(

                onContinue = {

                    // અત્યારે Login Screen નથી,
                    // એટલે Testing માટે Language પર પાછા મોકલી રહ્યા છીએ.
                    // Login Screen બન્યા પછી આ Line બદલીશું.

                    navController.navigate(Screen.Language.route) {

                        popUpTo(Screen.Language.route) {
                            inclusive = true
                        }

                    }

                }

            )

        }

    }

}