package com.smarteducationpro.app.feature.language

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import android.content.Context
import androidx.compose.ui.platform.LocalContext
import kotlinx.coroutines.launch
import com.smarteducationpro.app.data.UserPreferencesRepository


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
            text = "Choose Language",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(40.dp))

        LanguageItem(
            "English",
            selected == "English"
        ) {
            selected = "English"

            
        }

        Spacer(modifier = Modifier.height(15.dp))

        LanguageItem(
            "ગુજરાતી",
            selected == "ગુજરાતી"
        ) {
            selected = "ગુજરાતી"

            
        }

        Spacer(modifier = Modifier.height(15.dp))

        LanguageItem(
            "हिन्दी",
            selected == "हिन्दी"
        ) {
            selected = "हिन्दी"

            
        }

        Spacer(modifier = Modifier.weight(1f))

        Button(
    onClick = onContinue,
    modifier = Modifier.fillMaxWidth()
) {
    Text("Continue")
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

        colors = CardDefaults.cardColors(
            if (selected)
                Color(0xFF1565C0)
            else
                Color.LightGray
        ),

        shape = RoundedCornerShape(12.dp)

    ) {

        Text(
            text = title,
            modifier = Modifier.padding(20.dp),
            color = Color.White,
            fontSize = 18.sp
        )

    }

}