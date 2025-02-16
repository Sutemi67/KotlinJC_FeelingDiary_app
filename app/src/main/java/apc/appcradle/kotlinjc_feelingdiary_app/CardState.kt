package apc.appcradle.kotlinjc_feelingdiary_app

import androidx.compose.ui.graphics.Color

sealed interface CardState {
    object First : CardState
    object Second : CardState
    object MainList : CardState
    object ListAnger : CardState
    object ListFear : CardState
    object ListShame : CardState
    object ListSad : CardState
    object ListFun : CardState
    object ListLove : CardState
    data class OneFeelDescribing(val feel: String, val color: Color) : CardState

}