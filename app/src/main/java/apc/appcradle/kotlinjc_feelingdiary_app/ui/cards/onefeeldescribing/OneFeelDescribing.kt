package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.onefeeldescribing

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.R
import apc.appcradle.kotlinjc_feelingdiary_app.data.angerFeelingsLists
import apc.appcradle.kotlinjc_feelingdiary_app.ui.MainViewModel
import apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.ListItem
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.activeBorderField
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.dividerColor
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.funColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.inactiveBorderField
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.labelTextStyle
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.loveColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.mediumTextStyle
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.sadnessColor200
import org.koin.androidx.compose.koinViewModel

@Composable
fun OneFeelDescribing(
    name: String,
    color: Color,
    parentFeel: String,
    onClick1: () -> Unit,
    onClick2: () -> Unit,
    viewModel: MainViewModel = koinViewModel()
) {

    var sliderPosition by remember { mutableFloatStateOf(0f) }
    var text by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .wrapContentSize()
            .width(300.dp)
    ) {
        ListItem(name, color) { }
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
                .padding(vertical = 30.dp),
            value = sliderPosition,
            onValueChange = { sliderPosition = it },
            colors = SliderDefaults.colors(
                thumbColor = loveColor200,
                activeTrackColor = funColor200,
                inactiveTrackColor = sadnessColor200,
            ),
            valueRange = 0f..10f
        )
        Text(
            text = stringResource(R.string.questions),
            style = labelTextStyle,
            modifier = Modifier.padding(bottom = 20.dp)
        )

        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = {
                Text(text = "Опиши здесь", style = labelTextStyle)
            },
            textStyle = mediumTextStyle,
            colors = OutlinedTextFieldDefaults.colors(
                focusedLabelColor = activeBorderField,
                focusedBorderColor = activeBorderField,
                unfocusedLabelColor = inactiveBorderField,
                unfocusedTextColor = inactiveBorderField,
                unfocusedBorderColor = inactiveBorderField,
                cursorColor = activeBorderField
            ),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done)
        )
        Row(modifier = Modifier.padding(vertical = 15.dp)) {
            FilledTonalButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0x00FFFFFF),
                    contentColor = Color(0xA63B3B3B)
                ),
                onClick = {
                    onClick1()
                },
                modifier = Modifier.weight(1f)
            ) { Text(text = "Вернуться", style = mediumTextStyle) }
            ElevatedButton(
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFFD6F5B3),
                    contentColor = Color(0xE2393939),
                ),
                onClick = {
                    viewModel.saveFeelData(
                        feel = parentFeel,
                        secondaryFeel = name,
                        amount = sliderPosition,
                        comment = text,
                        color = color
                    )
                    onClick2()
                },
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 5.dp),
                modifier = Modifier.weight(1.1f)
            ) { Text(text = "Принять", style = mediumTextStyle) }
        }
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Lld() {
    OneFeelDescribing(
        angerFeelingsLists[1].name,
        angerFeelingsLists[1].color,
        "Anger",
        {},
        {},
    )
}