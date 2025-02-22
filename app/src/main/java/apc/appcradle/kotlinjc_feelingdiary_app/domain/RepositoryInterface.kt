package apc.appcradle.kotlinjc_feelingdiary_app.domain

import androidx.compose.ui.graphics.Color

interface RepositoryInterface {
    suspend fun saveFeelData(feel: String, amount: Float, comment: String, color: Color)
    suspend fun getFeelData(): List<FeelDiagram>
}