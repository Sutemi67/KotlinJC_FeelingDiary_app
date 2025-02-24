package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.ui.MainViewModel
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.applyButtonColor
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.labelTextStyle


@Composable
fun BottomButtons(data: List<FeelDiagram>, viewModel: MainViewModel, onClickBack: () -> Unit) {
    Row(Modifier.padding(vertical = 10.dp)) {
        if (data.isNotEmpty()) {
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
                containerColor = applyButtonColor,
                contentColor = Color(0xA63B3B3B)
            )
        ) { Text(text = "На главную", style = labelTextStyle) }
    }
}