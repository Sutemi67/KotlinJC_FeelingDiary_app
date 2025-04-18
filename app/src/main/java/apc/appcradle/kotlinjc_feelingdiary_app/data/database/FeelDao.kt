package apc.appcradle.kotlinjc_feelingdiary_app.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface FeelDao {
    // Пытаемся обновить запись, добавив новое значение к measurement
    @Query("UPDATE feelings SET measurement = measurement + :amount WHERE nameOfMainFeel = :feel")
    suspend fun addMeasurement(feel: String, amount: Float): Int

    @Query("UPDATE feelings SET comments = comments || '\n' || :comment WHERE nameOfMainFeel = :feel")
    suspend fun addComment(feel: String, comment: String): Int

    // Если записи нет, вставляем её
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(cell: FeelEntity): Long

    @Query("SELECT * FROM feelings")
    fun getAllCells(): List<FeelEntity>

    // Метод, объединяющий логику обновления или вставки, выполняется в транзакции
    @Transaction
    suspend fun insertOrAddMeasurement(cell: FeelEntity) {
        // Попытка обновить существующую запись. Метод вернёт количество обновлённых строк.
        val updatedRows = addMeasurement(cell.nameOfMainFeel, cell.measurement)
        val addComment = addComment(cell.nameOfMainFeel, cell.comments)
        if (updatedRows == 0 && addComment == 0) {
            // Если обновлений не произошло (записи с таким feel нет), вставляем новую
            insert(cell)
        }
    }

    @Query("DELETE FROM feelings")
    suspend fun clearData()
}