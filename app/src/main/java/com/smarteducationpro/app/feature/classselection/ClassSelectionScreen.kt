package com.smarteducationpro.app.feature.classselection

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.smarteducationpro.app.common.components.PrimaryButton

@Composable
fun ClassSelectionScreen(
    onContinue: () -> Unit
) {

    val classList = listOf(
        "Pre School",
        "Nursery",
        "Junior KG",
        "Senior KG",
        "Std 1",
        "Std 2",
        "Std 3",
        "Std 4",
        "Std 5",
        "Std 6",
        "Std 7",
        "Std 8",
        "Std 9",
        "Std 10",
        "Std 11 Science",
        "Std 11 Commerce",
        "Std 11 Arts",
        "Std 12 Science",
        "Std 12 Commerce",
        "Std 12 Arts"
    )

    var selectedClass by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {

            items(classList) { item ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp),

                    colors = CardDefaults.cardColors()
                ) {

                    Button(
                        onClick = {
                            selectedClass = item
                        },
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(item)
                    }

                }

            }

        }

        PrimaryButton(
            text = "Continue",
            onClick = onContinue
        )

    }

}