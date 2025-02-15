package apc.appcradle.kotlinjc_feelingdiary_app

sealed interface CardState {
    object First : CardState
    object Second : CardState
    object Third : CardState
    object Fourth : CardState

}