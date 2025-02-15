package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun SecondCard(onClick: () -> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(9.dp),
        modifier = Modifier
            .size(250.dp, 100.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF1D0BE)),
        onClick = { onClick() }
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Выбери из следующего списка основную эмоцию, а затем уточни.",
                textAlign = TextAlign.Center,
                style = TextStyle(
                    color = Color.Black,
                )
            )
        }
    }
}

@Preview
@Composable
fun Ffs() {
    SecondCard {}
}