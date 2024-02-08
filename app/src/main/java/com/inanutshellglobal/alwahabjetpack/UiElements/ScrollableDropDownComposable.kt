package com.inanutshellglobal.alwahabjetpack.UiElements

import android.widget.Toast
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext

@Composable
fun ScrollableDropDown() {
    var expanded by remember { mutableStateOf(false) }
    val contextForToast = LocalContext.current.applicationContext
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center),
        contentAlignment = Alignment.Center
    ) {
        // vertical 3 dots button
        IconButton(
            onClick = {
                expanded = true
            }
        ) {
            Icon(Icons.Default.MoreVert, contentDescription = "Open Menu")
        }

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            scrollState = scrollState
        ) {
            repeat(30) {
                DropdownMenuItem(
                    text = {
                        Text("Item $it")
                    },
                    onClick = {
                        Toast.makeText(contextForToast, "Item $it", Toast.LENGTH_SHORT).show()
                        expanded = false
                    }
                )
            }
        }
    }

    LaunchedEffect(expanded) {
        if (expanded) {
            // scroll to the last item
            scrollState.scrollTo(scrollState.maxValue)
        }
    }
}