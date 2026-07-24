package com.smarteducationpro.app.feature.medium

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.smarteducationpro.app.common.components.PrimaryButton
import com.smarteducationpro.app.common.components.SelectionCard

@Composable
fun MediumScreen(
    onContinue: () -> Unit
) {

    var selectedMedium by remember {
        mutableStateOf("English")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(40.dp))

        Text(
            text = "Choose Medium",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))

        SelectionCard(
            title = "English",
            selected = selectedMedium == "English"
        ) {
            selectedMedium = "English"
        }

        Spacer(modifier = Modifier.height(12.dp))

        SelectionCard(
            title = "ગુજરાતી",
            selected = selectedMedium == "ગુજરાતી"
        ) {
            selectedMedium = "ગુજરાતી"
        }

        Spacer(modifier = Modifier.height(12.dp))

        SelectionCard(
            title = "हिन्दी",
            selected = selectedMedium == "हिन्दी"
        ) {
            selectedMedium = "हिन्दी"
        }

        Spacer(modifier = Modifier.weight(1f))

        PrimaryButton(
            text = "Continue",
            onClick = onContinue
        )

    }
}