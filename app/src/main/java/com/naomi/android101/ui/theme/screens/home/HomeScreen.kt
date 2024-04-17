package com.naomi.android101.ui.theme.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.naomi.android101.navigation.ROUTE_LOGIN
import com.naomi.android101.navigation.ROUTE_REGISTER


@Composable
fun HomeScreen(navController: NavController){

    Column (
        modifier = Modifier.padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "This is a home screen")
        Spacer(modifier = Modifier.height(10.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN) }) {
           Text(text = "Go to About Screen")
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}