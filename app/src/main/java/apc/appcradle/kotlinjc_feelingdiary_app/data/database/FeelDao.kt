package apc.appcradle.kotlinjc_feelingdiary_app.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FeelDao {
    @Insert
    suspend fun insert(cell: FeelEntity)

    @Query("SELECT * FROM feelings")
    fun getAllCells(): List<FeelEntity>
}