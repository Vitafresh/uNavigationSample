package top.vitafresh.unavigationsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import top.vitafresh.unavigationsample.ui.theme.UNavigationSampleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UNavigationSampleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MyApp()
                }
            }
        }
    }
}


@Composable
fun MyApp(){
    val navController = rememberNavController()

    NavHost(
        navController=navController,
        startDestination = "first"
    ){
        composable("first"){
            FirstScreen{navController.navigate("second")}
        }
        composable("second"){
            SecondScreen{navController.navigate("third")}
        }
        composable("third"){
            ThirdScreen{navController.navigate("first")}
        }
    }
}