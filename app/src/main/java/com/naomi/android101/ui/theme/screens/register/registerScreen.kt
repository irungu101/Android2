package com.naomi.android101.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.naomi.android101.R
import com.naomi.android101.navigation.ROUTE_LOGIN

@Composable
fun RegisterScreen(navController: NavController){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,


    )
    {



        Text(text = "REGISTER HERE",
            color = Color.DarkGray,
            fontFamily = FontFamily.SansSerif,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = "",
            onValueChange = {},
            label = { Text(text = "Enter Your Email", color = Color.DarkGray)},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = "",
            onValueChange = {},
            label = { Text(text = "Enter Your Password", color = Color.DarkGray)},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(value = "",
            onValueChange = {},
            label = { Text(text = "Confirm Your Password", color = Color.DarkGray)},
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Next),
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp))
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {},
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Register")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            modifier = Modifier.fillMaxWidth()) {
            Text(text = "Have an account? Click to Login")
        }


    }

}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun RegisterScreenPreview(){
    RegisterScreen(rememberNavController())
}
