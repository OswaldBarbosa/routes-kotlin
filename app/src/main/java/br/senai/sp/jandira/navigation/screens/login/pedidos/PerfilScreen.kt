package br.senai.sp.jandira.navigation.screens.login.pedidos

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
fun PerfilScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Green),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "PERFIL",
            color = Color.White,
            fontSize = 48.sp
        )

        Button(
            modifier = Modifier
                .height(80.dp)
                .width(180.dp),
            colors = ButtonDefaults.buttonColors(Color.White),
            onClick = {navController.navigate("menu")}
        ) {

            Text(
                text = "Voltar",
                color = Color.Blue,
                fontSize = 24.sp
            )

        }

    }

}