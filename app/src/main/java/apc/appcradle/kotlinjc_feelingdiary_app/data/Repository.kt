package apc.appcradle.kotlinjc_feelingdiary_app.data

import androidx.compose.ui.graphics.Color
import apc.appcradle.kotlinjc_feelingdiary_app.data.database.AppDatabase
import apc.appcradle.kotlinjc_feelingdiary_app.data.database.Converter
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.domain.RepositoryInterface

class Repository(
    private val database: AppDatabase,
    private val converter: Converter
) : RepositoryInterface {

    override suspend fun saveFeelData(
        feel: String,
        secondaryFeel: String,
        amount: Float,
        comment: String,
        color: Color
    ) {
        val entity = converter.feelToEntity(feel, secondaryFeel, amount, comment, color)
        database.feelDao().insertOrAddMeasurement(entity)
    }

    override suspend fun getFeelData(): List<FeelDiagram> {
        val entityList = database.feelDao().getAllCells()
        val list = converter.entityToFeelDiagramClass(entityList)
        return list
    }

    override suspend fun clearData() {
        database.feelDao().clearData()
    }
}