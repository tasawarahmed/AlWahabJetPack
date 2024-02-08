package com.inanutshellglobal.alwahabjetpack.UiElements

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun DottedDropDown() {
    var expanded by remember { mutableStateOf(false) }
    val contextForToast = LocalContext.current.applicationContext

    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(align = Alignment.Center),
        contentAlignment = Alignment.Center
    ) {
        // vertical 3 dots icon
        IconButton(
            onClick = {
                expanded = true
            }
        ) {
            Icon(Icons.Default.MoreVert, contentDescription = "Open Menu")
        }

        // menu
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            // menu items
            DropdownMenuItem(
                text = {
                    Text("Edit")
                },
                onClick = {
                    Toast.makeText(contextForToast, "Edit", Toast.LENGTH_SHORT).show()
                    expanded = false
                },
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Edit,
                        contentDescription = null
                    )
                }
            )

            DropdownMenuItem(
                text = {
                    Text("Settings")
                },
                onClick = {
                    Toast.makeText(contextForToast, "Settings", Toast.LENGTH_SHORT).show()
                    expanded = false
                },
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Settings,
                        contentDescription = null
                    )
                }
            )

            DropdownMenuItem(
                text = {
                    Text("Send Feedback")
                },
                onClick = {
                    Toast.makeText(contextForToast, "Send Feedback", Toast.LENGTH_SHORT).show()
                    expanded = false
                },
                leadingIcon = {
                    Icon(
                        Icons.Outlined.Email,
                        contentDescription = null
                    )
                }
            )
        }
    }
}