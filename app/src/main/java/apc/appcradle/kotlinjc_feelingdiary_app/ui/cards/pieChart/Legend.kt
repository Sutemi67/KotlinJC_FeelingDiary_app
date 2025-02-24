package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.labelTextStyle
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.mediumTextStyle
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.rowColor

@Composable
fun Legend(data: List<FeelDiagram>, viewWidth: Dp) {
    val expandedStates = remember { mutableStateMapOf<Int, Boolean>() }

    Column(
        modifier = Modifier.width(viewWidth)
    ) {
        data.forEachIndexed { index, item ->
            val isExpanded = expandedStates[index] == true
            Column(
                Modifier
                    .padding(6.dp)
                    .clickable(onClick = { expandedStates[index] = !isExpanded })
                    .shadow(
                        elevation = 5.dp,
                        shape = RoundedCornerShape(10.dp)
                    )
                    .background(
                        color = rowColor,
                        shape = RoundedCornerShape(12.dp)
                    )
                    .animateContentSize()
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)
                ) {
                    Canvas(
                        modifier = Modifier
                            .padding(horizontal = 5.dp)
                            .size(20.dp)
                    ) {
                        drawRoundRect(
                            color = item.color,
                            size = size,
                            cornerRadius = CornerRadius(15f, 15f)
                        )
                    }
                    Text(
                        style = mediumTextStyle,
                        fontSize = 20.sp,
                        text = item.name,
                        modifier = Modifier.padding(8.dp),
                    )
                }
                if (isExpanded) {
                    Text(
                        text = item.comments,
                        style = labelTextStyle,
                        textAlign = TextAlign.Start,
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}