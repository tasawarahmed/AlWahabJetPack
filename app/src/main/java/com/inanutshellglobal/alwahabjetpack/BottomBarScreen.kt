package com.inanutshellglobal.alwahabjetpack

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu


sealed class BottomBarScreen (
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object Fee: BottomBarScreen(
        route = "fee",
        title = "Fee",
        icon = Icons.Default.AccountBox
    )
    object Diary: BottomBarScreen(
        route = "diary",
        title = "Diary",
        icon = Icons.Default.Edit
    )
    object Result: BottomBarScreen(
        route = "result",
        title = "Result",
        icon = Icons.Default.Menu
    )
}