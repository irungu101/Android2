package com.naomi.android101.ui.theme.screens.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.naomi.android101.navigation.ROUTE_REGISTER

@Composable
fun LoginScreen(navController: NavController){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Please Login Here")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_REGISTER) }) {
            Text(text = "Go to Register Screen")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen(rememberNavController())
}