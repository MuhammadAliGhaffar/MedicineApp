package com.example.arlibapps.feature.dashboard

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

@Composable
fun DashboardScreen(
    navController: NavController,
    dashboardViewModel: DashboardViewModel = hiltViewModel()
) {
    Text(text = "DashboardScreen")
}