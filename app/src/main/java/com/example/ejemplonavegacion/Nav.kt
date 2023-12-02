package com.example.ejemplonavegacion

import androidx.compose.runtime.Composable
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable


@Composable
fun Nav(navController: NavHostController) {

    NavHost(navController = navController, startDestination = "Pantalla 1" ){
        composable("Pantalla 1"){
            ScreenA(navController)
        }
        composable("Pantalla 2"){
            ScreenB(navController)
        }
        composable("Pantalla 3"){
            ScreenC(navController)
        }

    }
}