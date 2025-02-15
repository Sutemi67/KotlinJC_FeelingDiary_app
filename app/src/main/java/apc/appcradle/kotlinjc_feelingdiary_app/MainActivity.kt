package apc.appcradle.kotlinjc_feelingdiary_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.KotlinJC_FeelingDiary_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinJC_FeelingDiary_appTheme {
                Greeting()
            }
        }
    }
}

@Composable
fun Greeting() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.linearGradient(
                    colors = listOf(Color(0xFF6CAA65), Color(0xFFFFEAAA)),
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Card(
            elevation = CardDefaults.cardElevation(9.dp),
            modifier = Modifier
                .size(250.dp, 100.dp),
            border = BorderStroke(1.dp, Color.Black),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFF1D0BE)),

            ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Привет!\nЧто ты чувствуешь сейчас?\nНажми чтобы продолжить.",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        color = Color.Black,
                    )
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinJC_FeelingDiary_appTheme {
        Greeting()
    }
}