package com.naomi.android101.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.naomi.android101.ui.theme.screens.about.AboutScreen
import com.naomi.android101.ui.theme.screens.home.HomeScreen
import com.naomi.android101.ui.theme.screens.login.LoginScreen
import com.naomi.android101.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier=Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String = ROUTE_REGISTER){
    NavHost(
        navController = navController,
        modifier= modifier ,
        startDestination = startDestination
    ){
        composable(ROUTE_HOME){ HomeScreen(navController)}
        composable(ROUTE_REGISTER){ RegisterScreen(navController)}
        composable(ROUTE_ABOUT){ AboutScreen(navController)}
        composable(ROUTE_LOGIN){ LoginScreen(navController)}
    }

}