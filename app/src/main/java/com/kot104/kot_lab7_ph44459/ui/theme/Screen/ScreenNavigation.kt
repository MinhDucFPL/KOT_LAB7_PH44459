package com.kot104.kot_lab7_ph44459.ui.theme.Screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.quyduoi.lab7_md18309_ph41939.model.ViewModel.MainViewModel
import com.quyduoi.lab7_md18309_ph41939.ui.screens.Bai3.LoginScreen

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    val mainViewModel: MainViewModel = viewModel()
    val moviesState = mainViewModel.movies.observeAsState(initial = emptyList())

    NavHost(
        navController = navController,
        startDestination = Screen.LOGIN.route,
    ) {
        composable(Screen.LOGIN.route) { LoginScreen(navController) }
        composable(Screen.MOVIE_SCREEN.route) { MovieScreen(moviesState.value) }
        composable(Screen.SCREEN1.route) { Screen1(navController) }
        composable(Screen.SCREEN2.route) { Screen2(navController) }
        composable(Screen.SCREEN3.route) { Screen3(navController) }
    }
}