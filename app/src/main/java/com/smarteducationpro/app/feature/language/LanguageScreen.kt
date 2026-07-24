package com.smarteducationpro.app.feature.language

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smarteducationpro.app.R

@Composable
fun LanguageScreen(
    onContinue: () -> Unit
) {

    var selected by remember {
        mutableStateOf("English")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(50.dp))

        Text(
            text = stringResource(R.string.choose_language),
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(40.dp))

        LanguageItem(
            title = stringResource(R.string.english),
            selected = selected == "English"
        ) {
            selected = "English"
        }

        Spacer(modifier = Modifier.height(15.dp))

        LanguageItem(
            title = stringResource(R.string.gujarati),
            selected = selected == "Gujarati"
        ) {
            selected = "Gujarati"
        }

        Spacer(modifier = Modifier.height(15.dp))

        LanguageItem(
            title = stringResource(R.string.hindi),
            selected = selected == "Hindi"
        ) {
            selected = "Hindi"
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onContinue
        ) {

            Text(
                text = stringResource(R.string.continue_text)
            )

        }

    }

}

@Composable
fun LanguageItem(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onClick()
            },

        shape = RoundedCornerShape(12.dp),

        colors = CardDefaults.cardColors(
            containerColor =
            if (selected)
                Color(0xFF1565C0)
            else
                Color(0xFFE0E0E0)
        )

    ) {

        Text(
            text = title,
            modifier = Modifier.padding(20.dp),
            color =
            if (selected)
                Color.White
            else
                Color.Black,
            fontSize = 18.sp
        )

    }

}