package com.inanutshellglobal.alwahabjetpack

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.inanutshellglobal.alwahabjetpack.Composables.StudentDiary
import com.inanutshellglobal.alwahabjetpack.Composables.StudentFee
import com.inanutshellglobal.alwahabjetpack.Composables.StudentResult

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(navController = navController, startDestination = BottomBarScreen.Fee.route){
        composable(route = BottomBarScreen.Fee.route){
            StudentFee()
        }
        composable(route = BottomBarScreen.Diary.route){
            StudentDiary()
        }
        composable(route = BottomBarScreen.Result.route){
            StudentResult()
        }
    }
}