package apc.appcradle.kotlinjc_feelingdiary_app.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [FeelEntity::class], version = 5)
abstract class AppDatabase : RoomDatabase() {
    abstract fun feelDao(): FeelDao
}