package br.senai.sp.jandira.navigation.screens.login.login

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideIn
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Magenta),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "LOGIN",
            color = Color.White,
            fontSize = 48.sp
        )

        AnimatedVisibility(
            visible = true,
            enter = fadeIn(tween(1000
            ))
        ) {
            Button(
                onClick = { navController.navigate("menu") },
                modifier = Modifier
                    .height(80.dp)
                    .width(180.dp),
                colors = ButtonDefaults.buttonColors(Color.White)
            ) {

                Text(
                    text = "Entrar",
                    color = Color.Blue,
                    fontSize = 24.sp
                )

            }
        }


    }

}