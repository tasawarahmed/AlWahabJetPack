package com.inanutshellglobal.alwahabjetpack.UiElements

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.material.*
import androidx.navigation.compose.*
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun BottomNavigationBar() {
    val navController = rememberAnimatedNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentRoute = navBackStackEntry?.destination?.route
                BottomNavigationItem(
                    icon = { Icon(Icons.Filled.Home, contentDescription = "Home") },
                    label = { Text("Home") },
                    selected = currentRoute == "home",
                    onClick = {
                        navController.navigate("home") {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Filled.Person, contentDescription = "Profile") },
                    label = { Text("Profile") },
                    selected = currentRoute == "profile",
                    onClick = {
                        navController.navigate("profile") {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Filled.Info, contentDescription = "Info") },
                    label = { Text("Info") },
                    selected = currentRoute == "info",
                    onClick = {
                        navController.navigate("info") {
                            popUpTo(navController.graph.startDestinationId)
                            launchSingleTop = true
                        }
                    }
                )
            }
        }
    ) {
        NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeScreen() }
            composable("profile") { ProfileScreen() }
            composable("info") { InfoScreen() }
        }
    }
}

@Composable
fun HomeScreen() {
    // Your home screen UI code here
}

@Composable
fun ProfileScreen() {
    // Your profile screen UI code here
}

@Composable
fun InfoScreen() {
    // Your info screen UI code here
}

/*
@Composable
fun BottomAppBarExample() {
    Scaffold(
        bottomBar = {
            BottomAppBar(
                actions = {
                    IconButton(onClick = { */
/* do something *//*
 }) {
                        Icon(Icons.Filled.Check, contentDescription = "Localized description")
                    }
                    IconButton(onClick = { */
/* do something *//*
 }) {
                        Icon(
                            Icons.Filled.Edit,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = { */
/* do something *//*
 }) {
                        Icon(
                            Icons.Filled.ShoppingCart,
                            contentDescription = "Localized description",
                        )
                    }
                    IconButton(onClick = { */
/* do something *//*
 }) {
                        Icon(
                            Icons.Filled.AccountBox,
                            contentDescription = "Localized description",
                        )
                    }
                },
                floatingActionButton = {
                    FloatingActionButton(
                        onClick = { */
/* do something *//*
 },
                        containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                        elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
                    ) {
                        Icon(Icons.Filled.Add, "Localized description")
                    }
                }
            )
        },
    ) { innerPadding ->
        Text(
            modifier = Modifier.padding(innerPadding),
            text = "Example of a scaffold with a bottom app bar."
        )
    }
}*/
