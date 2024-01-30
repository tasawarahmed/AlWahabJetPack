package com.inanutshellglobal.alwahabjetpack

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowForward
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.MailOutline
import androidx.compose.material.icons.outlined.MoreVert
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun ListUI() {
    LazyColumn(modifier = Modifier.fillMaxSize())
    {
        items(items = tasks, key = { it.id }) { task ->
            ListItem(
                headlineContent = { Text(text = task.name) },
                leadingContent = {
                    Icon(imageVector = task.icon, contentDescription = "Hello World")
                },
                trailingContent = {
                    Icon(imageVector = Icons.Outlined.MoreVert, contentDescription = "Hello World")
                })
        }
    }
}


data class Task(
    val id: Int,
    val name: String,
    val icon: ImageVector
)

val tasks = listOf(
    Task(1, "Buy Generator", Icons.Outlined.ShoppingCart),
    Task(2, "Call Now", Icons.Outlined.Phone),
    Task(3, "Finish Project", Icons.Outlined.ArrowForward),
    Task(4, "Go for Run", Icons.Outlined.FavoriteBorder),
    Task(5, "Rad a Book", Icons.Outlined.MailOutline),
)