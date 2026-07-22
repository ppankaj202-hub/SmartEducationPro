package com.smarteducationpro.app.feature.language

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LanguageScreen(
    onContinue: () -> Unit = {}
) {

    var selected by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(60.dp))

        Text(
            text = "Select Language",
            fontSize = 28.sp
        )

        Spacer(modifier = Modifier.height(40.dp))

        listOf(
            "English",
            "ગુજરાતી",
            "हिन्दी"
        ).forEach {

            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),

                onClick = {
                    selected = it
                }
            ) {

                Text(
                    text = it,
                    modifier = Modifier.padding(20.dp),
                    fontSize = 22.sp
                )

            }

        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = onContinue,
            enabled = selected.isNotEmpty(),
            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Continue")

        }

    }

}