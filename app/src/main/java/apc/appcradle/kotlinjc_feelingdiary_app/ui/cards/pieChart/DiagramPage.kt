package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.ui.MainViewModel
import org.koin.androidx.compose.koinViewModel
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin


@Composable
fun DiagramPage(
    viewModel: MainViewModel = koinViewModel(),
    onClick: () -> Unit
) {
    LaunchedEffect(Unit) {
        viewModel.loadData()
    }
    val data by viewModel.list.collectAsState()

    val total = data.sumOf { it.amount.toDouble() }.toFloat()
    var startAngle = 0f

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Canvas(
            modifier = Modifier.size(200.dp)
        ) {
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

        Spacer(modifier = Modifier.size(16.dp))

        // Легенда
        Column {
            data.forEach { item ->
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(end = 16.dp)
                ) {
                    Canvas(modifier = Modifier.size(16.dp)) {
                        drawRect(
                            color = item.color,
                            size = size
                        )
                    }
                    Text(
                        text = item.name,
                        modifier = Modifier.padding(start = 4.dp)
                    )
                }
            }
        }
        Row {
            FilledTonalButton(onClick = onClick) { Text("Очистить") }
            FilledTonalButton(onClick = onClick) { Text("На главную") }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun PieChartPreview() {
    DiagramPage() {}
}