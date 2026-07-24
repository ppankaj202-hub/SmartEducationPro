package com.smarteducationpro.app.feature.board

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smarteducationpro.app.R

@Composable
fun BoardScreen(
    onContinue: () -> Unit
) {

    val boards = stringArrayResource(R.array.boards)

    var selectedBoard by remember {
        mutableStateOf(boards[0])
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
            text = stringResource(R.string.choose_board),
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(30.dp))

        boards.forEach { board ->

            BoardItem(
                title = board,
                selected = selectedBoard == board
            ) {
                selectedBoard = board
            }

            Spacer(modifier = Modifier.height(12.dp))
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
            modifier = Modifier.fillMaxWidth(),
            onClick = onContinue
        ) {
            Text(stringResource(R.string.continue_text))
        }
    }
}

@Composable
fun BoardItem(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor =
            if (selected) Color(0xFF1565C0)
            else Color(0xFFE0E0E0)
        )
    ) {

        Text(
            text = title,
            modifier = Modifier.padding(20.dp),
            color = if (selected) Color.White else Color.Black,
            fontSize = 18.sp
        )
    }
}