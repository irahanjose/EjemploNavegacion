package com.example.ejemplonavegacion

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun ScreenC(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(text = "Pantalla 3", fontSize = 50.sp)
        Spacer(modifier = Modifier.height(35.dp))
        Button(onClick = {
            navController.navigate("Pantalla 1")
        }) {
            Text(text = "Vamos a la Pantalla 1", fontSize = 28.sp)
        }
    }
}