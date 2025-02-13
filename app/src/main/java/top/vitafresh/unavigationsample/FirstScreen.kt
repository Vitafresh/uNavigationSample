package top.vitafresh.unavigationsample

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import top.vitafresh.unavigationsample.ui.theme.UNavigationSampleTheme

@Composable
fun FirstScreen(navigateScreen: (String, Int) -> Unit) {
    val name = remember { mutableStateOf("") }
    val age = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "First Screen", fontSize = 24.sp)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text("Name") }
        )
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(
            value = age.value,
            onValueChange = { age.value = it },
            label = { Text("Age") }
        )

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
            // Handle button click
            navigateScreen(name.value, age.value.toIntOrNull() ?: 99)
        }) {
            Text(text = "Goto Second Screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun FirstScreenPreview() {
    UNavigationSampleTheme {
        //FirstScreen({})
    }
}
