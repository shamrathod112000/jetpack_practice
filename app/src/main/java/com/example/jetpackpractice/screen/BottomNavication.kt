package com.example.jetpackpractice.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.List
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController



//good 
enum class BottomNavigationItems() {

    Home(),
    File
}

@Composable
fun BottomNavication(navController: NavController?, bottomNavigationItems: BottomNavigationItems) {

    Row(
        modifier = Modifier


            .fillMaxWidth()
            .wrapContentHeight()
            .background(Color.Cyan)
            .padding(20.dp), horizontalArrangement = Arrangement.SpaceAround
    ) {


        for (item in bottomnaviCAtionlist) {


        }
        for (item in bottomnaviCAtionlist) {

            Icon(
                item.icon,
                contentDescription = item.dis,
                modifier = Modifier
                    .size(24.dp)
                    .background(if (bottomNavigationItems == BottomNavigationItems.Home) Color.Black else Color.Cyan)
            )


        }


//        Icon(
//            Icons.Rounded.Home,
//            contentDescription = "Home",
//            modifier = Modifier
//                .size(24.dp)
//                .background(if (bottomNavigationItems == BottomNavigationItems.Home) Color.Black else Color.Cyan)
//        )
//        Icon(
//            Icons.Rounded.List,
//            contentDescription = "File",
//            modifier = Modifier
//                .size(24.dp)
//                .background(if (bottomNavigationItems == BottomNavigationItems.File) Color.Black else Color.Cyan)
//        )
    }
}