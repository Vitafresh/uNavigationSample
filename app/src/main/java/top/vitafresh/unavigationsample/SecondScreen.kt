package top.vitafresh.unavigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import top.vitafresh.unavigationsample.ui.theme.UNavigationSampleTheme

@Composable
fun SecondScreen(navigateScreen: () -> Unit) {
//    val name = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Second Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        Text("Welcome to Second Screen", fontSize = 24.sp)

        Button(onClick = {
            // Handle button click
            navigateScreen()
        }) {
            Text(text = "Goto Third Screen")
        }
        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
@Preview(showBackground = true)
fun SecondScreenPreview() {
    UNavigationSampleTheme {
        SecondScreen({})
    }
}

