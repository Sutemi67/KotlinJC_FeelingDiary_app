package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.data.Feeling
import apc.appcradle.kotlinjc_feelingdiary_app.data.angerFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.data.fearFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.activeBorderField
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.dividerColor
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.funColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.inactiveBorderField
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.loveColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.mediumTextStyle
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.sadnessColor200

@Composable
fun OneFeelDescribing(feeling: Feeling) {

    var sliderPosition by remember { mutableFloatStateOf(0f) }
    var text by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentSize()
            .width(300.dp)
    ) {
        Spacer(Modifier.height(50.dp))
        ListItem(feeling.name, feeling.color) { }
        HorizontalDivider(
            thickness = 1.dp,
            color = dividerColor,
            modifier = Modifier.padding(vertical = 40.dp)
        )
        Text(
            text = "Опиши, насколько сильно твое чувство и, если захочешь, добавь комментарий",
            style = mediumTextStyle,
        )

        Slider(
            modifier = Modifier
                .padding(vertical = 40.dp),
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            colors = SliderDefaults.colors(
                thumbColor = loveColor200,
                activeTrackColor = funColor200,
                inactiveTrackColor = sadnessColor200,
            ),
            valueRange = 0f..10f
        )
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Опиши, что ты чувствуешь") },
            textStyle = mediumTextStyle,
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = activeBorderField,
                focusedBorderColor = activeBorderField,
                unfocusedLabelColor = inactiveBorderField,
                unfocusedTextColor = inactiveBorderField,
                unfocusedBorderColor = inactiveBorderField,
                cursorColor = activeBorderField
            )
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Lld() {
    OneFeelDescribing(angerFeelingsList[1])
}