package com.example.jetpackpractice.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun  ScreenFolder(wtViewModel: WTViewModel?,navController: NavController?) {

    Column(verticalArrangement = Arrangement.Bottom) {

        BottomNavication(navController = null, bottomNavigationItems = BottomNavigationItems.Home)

    }


}