package com.kot104.kot_lab7_ph44459

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.kot104.kot_lab7_ph44459.Model.ViewModel.MainViewModel
import com.kot104.kot_lab7_ph44459.ui.theme.KOT_LAB7_PH44459Theme
import com.kot104.kot_lab7_ph44459.ui.theme.Screen.ScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KOT_LAB7_PH44459Theme {
                val mainViewModel: MainViewModel = viewModel()
                val moviesState =
                    mainViewModel.movies.observeAsState(initial = emptyList())
//            MovieScreen(moviesState.value)
                ScreenNavigation()
            }
        }
    }
}
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KOT_LAB7_PH44459Theme {
        Greeting("Android")
    }
}