package apc.appcradle.kotlinjc_feelingdiary_app.data.database

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.ui.graphics.Color
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Converter {

    @RequiresApi(Build.VERSION_CODES.O)
    fun feelToEntity(
        feel: String,
        secondaryFeel: String,
        newAmount: Float,
        comment: String,
        color: Color
    ): FeelEntity {
        return FeelEntity(
            nameOfMainFeel = feel,
            measurement = newAmount,
            color = color.value.toLong(),
            comments = "$secondaryFeel - ${newAmount.toInt()}/10 - ${
                LocalDate.now().format(DateTimeFormatter.ofPattern("d.MMM.yyyy"))
            }\n$comment"
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