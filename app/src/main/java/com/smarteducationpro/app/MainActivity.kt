package com.smarteducationpro.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.smarteducationpro.app.navigation.AppNavigation
import com.smarteducationpro.app.ui.theme.SmartEducationProTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            SmartEducationProTheme {
                AppNavigation()
            }
        }
    }
}