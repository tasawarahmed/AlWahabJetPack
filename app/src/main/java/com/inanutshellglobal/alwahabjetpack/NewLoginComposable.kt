package com.inanutshellglobal.alwahabjetpack

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun LoginScreen() {
    val isImeVisible by rememberImeState()
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(if (isImeVisible) 0f else 0.35f )
        ) {
            Text(
                text = "Welcome to SchoolERP",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.Black
            )
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .background(color = colorResource(id = R.color.blue_button)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (isSmallScreenHeight()) {
                Spacer(modifier = Modifier.fillMaxSize(0.05f))
            } else {
                Spacer(modifier = Modifier.fillMaxSize(0.1f))
            }
            Text(
                text = "Log in",
                style = MaterialTheme.typography.headlineMedium,
                color = Color.Black
            )
            if (isSmallScreenHeight()) {
                Spacer(modifier = Modifier.fillMaxSize(0.05f))
            } else {
                Spacer(modifier = Modifier.fillMaxSize(0.1f))
            }
            MyTextField(
                modifier = Modifier.padding(horizontal = 16.dp),
                label = "User Name",
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                keyboardActions = KeyboardActions()
            )
            Spacer(modifier = Modifier.height(20.dp))
            MyTextField(
                modifier = Modifier.padding(horizontal = 16.dp),
                label = "Password",
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                keyboardActions = KeyboardActions(),
                trailingIcon = Icons.Default.Lock
            )
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.CenterStart) {
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Blue,
                        contentColor = Color.White
                    )
                ) {
                    Text(text = "Log in")

                }

            }
        }
    }
}