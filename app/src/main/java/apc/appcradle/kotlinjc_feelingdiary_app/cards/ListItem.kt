package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.titleTextStyle

@Composable
fun ListItem(text: String, color: Color, onClick: () -> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(3.dp),
        modifier = Modifier
            .size(260.dp, 50.dp)
            .padding(5.dp),
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
                style = titleTextStyle
            )
        }
    }
}

@Preview
@Composable
fun Dd() {
    ListItem("Гнев", Color.White) { CardState.First }
}