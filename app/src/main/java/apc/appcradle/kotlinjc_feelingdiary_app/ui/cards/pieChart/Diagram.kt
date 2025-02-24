package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.content.res.ResourcesCompat
import apc.appcradle.kotlinjc_feelingdiary_app.R
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.angerColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.sadnessColor200
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin

@Composable
fun Diagram(data: List<FeelDiagram>, viewWidth: Dp, context: Context) {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .shadow(
                elevation = 18.dp,
                shape = RoundedCornerShape(200.dp)
            )
    ) {
        Canvas(
            modifier = Modifier.size(viewWidth),
        ) {
            var startAngle = 270f
            var total = data.sumOf { it.amount.toDouble() }.toFloat()

            data.forEach { item ->
                var divideCount = item.amount / total
                if (total == 0f) {
                    divideCount = 1f
                }
                var sweepAngle = divideCount * 360
                drawArc(
                    color = item.color,
                    startAngle = startAngle,
                    sweepAngle = sweepAngle,
                    useCenter = true,
                    size = size
                )

                val angle = (startAngle + sweepAngle / 2) * (PI.toFloat() / 180f)
                val radius = size.width / 2 * 0.6f
                val x = size.width / 2 + cos(angle) * radius
                val y = size.height / 2 + sin(angle) * radius

                drawContext.canvas.nativeCanvas.drawText(
                    "%.1f%%".format(divideCount * 100),
                    x,
                    y,
                    Paint().apply {
                        color = Color.BLACK
                        textSize = 30f
                        textAlign = Paint.Align.CENTER
                        typeface =
                            ResourcesCompat.getFont(
                                context,
                                R.font.comfortaa_light
                            )
                    }
                )
                startAngle += sweepAngle
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Ff() {
    Diagram(
        listOf<FeelDiagram>(
            FeelDiagram("sdfsdf", 23f, "sdf", angerColor200),
            FeelDiagram("sdfsdf", 15f, "sdf", sadnessColor200)
        ),
        viewWidth = 200.dp,
        context = LocalContext.current
    )
}