package apc.appcradle.kotlinjc_feelingdiary_app.domain

import androidx.compose.ui.graphics.Color

sealed interface Feel {
    val name: String
    val color: Color
    val returnState: CardState

    data class Side(
        override val name: String,
        override val color: Color,
        override val returnState: CardState,
        val parentFeel: Main
    ) : Feel

    data class Main(
        override val name: String,
        override val color: Color,
        override val returnState: CardState
    ) : Feel
}