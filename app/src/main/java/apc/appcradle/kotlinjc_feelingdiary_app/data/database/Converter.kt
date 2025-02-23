package apc.appcradle.kotlinjc_feelingdiary_app.data.database

import androidx.compose.ui.graphics.Color
import androidx.room.TypeConverter
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converter {

    @TypeConverter
    fun fromString(value: String): List<String> {
        val type = object : TypeToken<List<String>>() {}.type
        return Gson().fromJson(value, type)
    }

    @TypeConverter
    fun toString(list: List<String>): String {
        return Gson().toJson(list)
    }

    fun feelToEntity(feel: String, secondaryFeel:String, newAmount: Float, comment: String, color: Color): FeelEntity {
        return FeelEntity(
            nameOfMainFeel = feel,
            measurement = newAmount,
            color = color.value.toLong(),
            comments = "$secondaryFeel - $comment"
        )
    }

    fun entityToFeelDiagramClass(feelEntity: List<FeelEntity>): List<FeelDiagram> {
        val list = mutableListOf<FeelDiagram>()
        feelEntity.forEach { item ->
            list.add(
                FeelDiagram(
                    name = item.nameOfMainFeel,
                    amount = item.measurement,
                    color = Color(item.color.toULong()),
                    comments = item.comments
                )
            )
        }
        return list.toList()
    }
}