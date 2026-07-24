package com.smarteducationpro.app.feature.classselection

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.smarteducationpro.app.R

@Composable
fun ClassSelectionScreen(
    onContinue: () -> Unit
) {

    val classList = stringArrayResource(R.array.class_list).toList()

    var selectedClass by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = stringResource(R.string.choose_class),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {

            items(classList) { item ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 6.dp)
                        .clickable {
                            selectedClass = item
                        },

                    shape = RoundedCornerShape(12.dp),

                    colors = CardDefaults.cardColors(
                        containerColor =
                        if (selectedClass == item)
                            Color(0xFF1565C0)
                        else
                            Color(0xFFF5F5F5)
                    )
                ) {

                    Text(
                        text = item,
                        modifier = Modifier.padding(18.dp),
                        color =
                        if (selectedClass == item)
                            Color.White
                        else
                            Color.Black
                    )

                }

            }

        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = onContinue,
            modifier = Modifier.fillMaxWidth(),
            enabled = selectedClass.isNotEmpty()
        ) {

            Text(
                text = stringResource(R.string.continue_text)
            )

        }

    }

}