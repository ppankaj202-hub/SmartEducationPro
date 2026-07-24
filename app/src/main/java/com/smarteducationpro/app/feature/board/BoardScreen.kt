package com.smarteducationpro.app.feature.board

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun BoardScreen(
    onContinue: () -> Unit
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {


Text(stringResource(R.string.choose_board))

stringResource(R.string.gseb)
stringResource(R.string.cbse)
stringResource(R.string.icse)
        Text(
            text = "Select Board"
        )

        Button(
            onClick = onContinue
        ) {

            Text("Continue")

        }

    }

}