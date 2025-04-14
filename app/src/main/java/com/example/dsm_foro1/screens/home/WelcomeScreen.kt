package com.example.dsm_foro1.screens.welcome

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.dsm_foro1.screens.login.LoginScreen
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.dsm_foro1.R

@Composable
fun WelcomeScreen(email: String) {
    val username = email.substringBefore("@")

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(22.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "logo",
            modifier = Modifier
                .height(120.dp)
                .padding(bottom = 16.dp)
        )
        Text(text = "¡Bienvenido a la aplicación!", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Tu usuario es:", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(18.dp))
        Text(text = username, style = MaterialTheme.typography.headlineLarge, color = MaterialTheme.colorScheme.error)
        Spacer(modifier = Modifier.height(24.dp))
        Text("Aplicación creada con Jetpack Compose", color = MaterialTheme.colorScheme.outline)
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen("usuarioprueba@mail.com")
}