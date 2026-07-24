package com.smarteducationpro.app.common.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SelectionCard(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick),

        shape = RoundedCornerShape(14.dp),

        colors = CardDefaults.cardColors(
            if (selected)
                Color(0xFF1565C0)
            else
                Color(0xFFE0E0E0)
        )

    ) {

        Text(
            text = title,
            modifier = Modifier.padding(20.dp),
            color = Color.White,
            fontSize = 18.sp
        )

    }

}