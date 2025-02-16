package apc.appcradle.kotlinjc_feelingdiary_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import apc.appcradle.kotlinjc_feelingdiary_app.cards.MainScreen
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.KotlinJC_FeelingDiary_appTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinJC_FeelingDiary_appTheme {
                MainScreen()
            }
        }
    }
}