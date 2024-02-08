package com.inanutshellglobal.alwahabjetpack.Composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.inanutshellglobal.alwahabjetpack.R
import com.inanutshellglobal.alwahabjetpack.UiElements.TableScreen

@Composable
fun StudentDiary() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.details_background_image),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Add your other composables here
    }

    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.10f),
            contentAlignment = Alignment.TopStart
        ) {
            Column {
                Text(
                    text = "Student: ...",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .background(
                            color = colorResource(
                                id = R.color.fee_card
                            ).copy(alpha = 0.6f)
                        )
                        .fillMaxWidth(1f)
                        .padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
                Text(
                    text = "Please Select a Date",
                    color = colorResource(id = R.color.white),
                    modifier = Modifier
                        .background(
                            color = colorResource(
                                id = R.color.fee_card
                            ).copy(alpha = 0.6f)
                        )
                        .fillMaxWidth(1f)
                        .padding(5.dp),
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }
        }

        Text(
            text = "Diary for Selected Date:",
            fontWeight = FontWeight.Bold,
            fontSize = 15.sp
        )
        TableScreen()
    }
}
