package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import androidx.compose.ui.graphics.Color

data class ChartData(
    val value: Float,
    val color: Color,
    val mainFeel: String,
    val comments: String
)