package apc.appcradle.kotlinjc_feelingdiary_app.domain

import androidx.compose.ui.graphics.Color

data class FeelDiagram(
    val name: String,
    val amount: Float,
    val comments: String,
    val color: Color
)