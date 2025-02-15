package apc.appcradle.kotlinjc_feelingdiary_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import apc.appcradle.kotlinjc_feelingdiary_app.cards.FirstCard
import apc.appcradle.kotlinjc_feelingdiary_app.cards.SecondCard
import apc.appcradle.kotlinjc_feelingdiary_app.cards.ThirdCard
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
    var state = remember { mutableStateOf<CardState>(CardState.First) }
    var boxBg = Modifier
        .background(
            Brush.linearGradient(
                colors = listOf(Color(0xFF6CAA65), Color(0xFFFFEAAA)),
            )
        )
    Box(
        modifier = boxBg
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        AnimatedContent(
            targetState = state.value,
            label = "CardStateAnimation"
        ) { targetState ->
            when (targetState) {
                is CardState.First -> FirstCard(onClick = {
                    state.value = CardState.Second
                })

                is CardState.Second -> SecondCard(onClick = {
                    state.value = CardState.Third
                })

                is CardState.Third -> ThirdCard { }
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