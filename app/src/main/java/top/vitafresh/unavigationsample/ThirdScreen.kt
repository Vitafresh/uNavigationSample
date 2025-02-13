package top.vitafresh.unavigationsample


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import top.vitafresh.unavigationsample.ui.theme.UNavigationSampleTheme

@Composable
fun ThirdScreen(navigateScreen: () -> Unit) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = {
            /* TO DO */
            navigateScreen()
        }
        ) {
            Text("3: Goto First Screen")
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ThirdScreenPreview() {
    UNavigationSampleTheme {
        ThirdScreen({})
    }
}