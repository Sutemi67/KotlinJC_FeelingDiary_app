package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import androidx.compose.ui.unit.sp

@Composable
fun ThirdCardListItem(text: String, color: Color, onClick: () -> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(3.dp),
        modifier = Modifier
            .width(250.dp)
            .padding(6.dp),
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = { onClick() }
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                modifier = Modifier.padding(10.dp),
                style = TextStyle(
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
            )
        }
    }
}

@Preview
@Composable
fun Dd() {
    ThirdCardListItem("Гнев", Color.White) {}
}