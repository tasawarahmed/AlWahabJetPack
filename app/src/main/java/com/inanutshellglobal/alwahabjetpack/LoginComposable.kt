package com.inanutshellglobal.alwahabjetpack

import android.content.Intent
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Login() {
    val isImeVisible by rememberImeState()
    val context = LocalContext.current
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.background_image),
            contentDescription = "Background Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        // Add your other composables here
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(space = 10.dp)
    ) {
        val animateUpperSectionRatio by animateFloatAsState(
            targetValue = if (isImeVisible) 0.25f else 0.5f,
            label = ""
        )
        Box(
            modifier = Modifier
                .fillMaxWidth(0.8f)
                .fillMaxHeight(animateUpperSectionRatio),
            contentAlignment = Alignment.BottomCenter
        ) {
            Image(
                painter = painterResource(id = R.drawable.full_logo),
                contentDescription = "Logo",
                contentScale = ContentScale.Fit,
            )
        }
        Card(
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            shape = RoundedCornerShape(8.dp),
            //border = BorderStroke(1.dp, color = colorResource(id = R.color.orange)),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.white).copy(
                    alpha = 0.9f
                )
            )
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .padding(5.dp)
            ) {
                var textLogin by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = textLogin,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    onValueChange = { newText: String -> textLogin = newText },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "User Name") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Person,
                            contentDescription = "User Name"
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = colorResource(
                            id = R.color.orange
                        ), unfocusedBorderColor = colorResource(id = R.color.blue_button)
                    ),
                    shape = RoundedCornerShape(15.dp),
                )
                var textPassword by rememberSaveable { mutableStateOf("") }
                OutlinedTextField(
                    value = textPassword,
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                    visualTransformation = PasswordVisualTransformation(),
                    onValueChange = { newText: String -> textPassword = newText },
                    modifier = Modifier.fillMaxWidth(),
                    label = { Text(text = "Password") },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Filled.Lock,
                            contentDescription = "User Name"
                        )
                    },
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = colorResource(
                            id = R.color.orange
                        ), unfocusedBorderColor = colorResource(id = R.color.blue_button)
                    ),
                    shape = RoundedCornerShape(15.dp),
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Button(
                    modifier = Modifier
                        .fillMaxWidth(),
                    onClick = {
                        context.startActivity(
                            Intent(
                                context,
                                StudentListActivity::class.java
                            )
                        )
                    },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White, containerColor = colorResource(
                            id = R.color.orange
                        )
                    ),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text("Login", fontWeight = FontWeight.Bold, fontFamily = FontFamily.Monospace)
                }
                TextButton(
                    onClick = { context.startActivity(Intent(context, GuestActivity::class.java)) },
                    colors = ButtonDefaults.textButtonColors(
                        contentColor = colorResource(
                            id = R.color.blue_button
                        )
                    )
                ) {
                    Text("Continue as Guest", fontWeight = FontWeight.Bold)
                }
            }
        }
    }
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ) {
        Card(
            modifier = Modifier.fillMaxWidth(),
            //border = BorderStroke(1.dp, color = colorResource(id = R.color.orange)),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.white))
        ) {
            TextButton(
                onClick = { },
                colors = ButtonDefaults.textButtonColors(
                    contentColor = colorResource(
                        id = R.color.blue_button
                    )
                )
            ) {
                //Text("Developed and Maintained by Israr Ahmed", fontWeight = FontWeight.Light, textAlign = TextAlign.Center)
                Text(
                    text = "Developed and Maintained by Mr. Israr Ahmed",
                )
            }
        }
    }
}