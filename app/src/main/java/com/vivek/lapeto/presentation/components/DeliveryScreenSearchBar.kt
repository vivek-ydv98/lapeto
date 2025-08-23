package com.vivek.lapeto.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DeliveryScreenSearchBar(navController: NavController){
 val query by remember { mutableStateOf("") }

    Row(modifier = Modifier.fillMaxWidth().height(48.dp).shadow(2.dp, RoundedCornerShape(16.dp))
        ) {  }
}