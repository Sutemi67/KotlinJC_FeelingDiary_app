package apc.appcradle.kotlinjc_feelingdiary_app.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "feelings")
data class FeelEntity(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val nameOfMainFeel: String,
    val measurement: Float,
    val color: Long,
    val comments: String
)