package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.R
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.mediumTextStyle

@Composable
fun TextCard(text: String, color: Color, onClick: () -> Unit) {
    Card(
        elevation = CardDefaults.cardElevation(9.dp),
        modifier = Modifier
            .size(250.dp, 100.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = { onClick() }
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = text,
                style = mediumTextStyle,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
        }
    }
}

@Preview
@Composable
fun Ff() {
    TextCard(stringResource(R.string.firstCardText), Color(0xFFF1D0BE)) {}
}