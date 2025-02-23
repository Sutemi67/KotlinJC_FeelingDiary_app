package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import android.graphics.Paint
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.ui.MainViewModel
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.applyButtonColor
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.labelTextStyle
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.mediumTextStyle
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.rowColor
import org.koin.androidx.compose.koinViewModel
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun DiagramPage(
    viewModel: MainViewModel = koinViewModel(),
    onClickBack: () -> Unit
) {
    LaunchedEffect(Unit) {
        viewModel.loadData()
    }
    val data by viewModel.list.collectAsState()


    var clearButtonVisibility by remember { mutableStateOf(false) }
    val expandedStates = remember { mutableStateMapOf<Int, Boolean>() }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (data == emptyList<FeelDiagram>()) {
            clearButtonVisibility = false
            Text(
                text = "Сейчас записей нет. Вы можете добавить одну такую, вернувшись на главную",
                modifier = Modifier.padding(horizontal = 20.dp),
                style = mediumTextStyle
            )
        } else {
            clearButtonVisibility = true
            Box(
                modifier = Modifier
                    .padding(16.dp)
                    .shadow(
                        elevation = 18.dp, // Высота тени
                        shape = RoundedCornerShape(200.dp) // Форма тени
                    )
            ) {
                Canvas(
                    modifier = Modifier.size(200.dp),
                ) {
                    var startAngle = 0f
                    val total = data.sumOf { it.amount.toDouble() }.toFloat()
                    data.forEach { item ->
                        val sweepAngle = (item.amount / total) * 360
                        drawArc(
                            color = item.color,
                            startAngle = startAngle,
                            sweepAngle = sweepAngle,
                            useCenter = true,
                            size = size
                        )

                        // Добавим подписи
                        val angle = (startAngle + sweepAngle / 2) * (PI.toFloat() / 180f)
                        val radius = size.width / 2 * 0.6f
                        val x = size.width / 2 + cos(angle) * radius
                        val y = size.height / 2 + sin(angle) * radius

                        drawContext.canvas.nativeCanvas.drawText(
                            "%.1f%%".format(item.amount / total * 100),
                            x,
                            y,
                            Paint().apply {
                                color = android.graphics.Color.BLACK
                                textSize = 24f
                                textAlign = Paint.Align.CENTER
                            }
                        )

                        startAngle += sweepAngle
                    }
                }
            }
        }
        Spacer(modifier = Modifier.size(16.dp))

        // Легенда
        Column(
            modifier = Modifier.width(210.dp)
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
        Row(Modifier.padding(vertical = 10.dp)) {
            if (clearButtonVisibility) {
                FilledTonalButton(
                    onClick = { viewModel.clearData() },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0x00FFFFFF),
                        contentColor = Color(0xA63B3B3B)
                    ),
                ) { Text(text = "Очистить", style = labelTextStyle) }
            }
            ElevatedButton(
                onClick = onClickBack,
                elevation = ButtonDefaults.buttonElevation(5.dp),
                colors = ButtonDefaults.elevatedButtonColors(
                    containerColor = applyButtonColor
                )
            ) { Text(text = "На главную", style = labelTextStyle) }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PieChartPreview() {
    DiagramPage(
        viewModel = koinViewModel(),
        onClickBack = {}
    )
}