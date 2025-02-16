package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.animation.AnimatedContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.R
import apc.appcradle.kotlinjc_feelingdiary_app.data.angerFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.data.fearFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.data.funFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.data.loveFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.data.mainFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.data.sadFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.data.shameFeelingsList
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.KotlinJC_FeelingDiary_appTheme
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.funColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.shameColor200


@Composable
fun MainScreen() {
    var state = remember { mutableStateOf<CardState>(CardState.First) }
    var boxBg = Modifier
        .background(
            Brush.linearGradient(
                colors = listOf(Color(0xFF6CAA65), Color(0xFFFFEAAA)),
            )
        )
    Box(
        modifier = boxBg
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        AnimatedContent(
            targetState = state.value,
            label = "CardStateAnimation"
        ) { targetState ->
            when (targetState) {
                CardState.First -> {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        TextCard(stringResource(R.string.firstCardText), funColor200) {
                            state.value = CardState.Second
                        }
                        Spacer(Modifier.height(30.dp))
                        TextCard(stringResource(R.string.firstCardText2), shameColor200) {
                            state.value = CardState.Second
                        }
                    }
                }

                CardState.Second -> {
                    TextCard(
                        stringResource(R.string.secondCardText),
                        Color(0xFFF1D0BE)
                    ) {
                        state.value = CardState.MainList
                    }
                }

                CardState.MainList -> ListOfFeels(mainFeelingsList) { st -> state.value = st }
                CardState.ListAnger -> ListOfFeels(angerFeelingsList) { st -> state.value = st }
                CardState.ListFear -> ListOfFeels(fearFeelingsList) { st -> state.value = st }
                CardState.ListFun -> ListOfFeels(funFeelingsList) { st -> state.value = st }
                CardState.ListLove -> ListOfFeels(loveFeelingsList) { st -> state.value = st }
                CardState.ListSad -> ListOfFeels(sadFeelingsList) { st -> state.value = st }
                CardState.ListShame -> ListOfFeels(shameFeelingsList) { st -> state.value = st }
                is CardState.OneFeelDescribing -> OneFeelDescribing(
                    targetState.feel,
                    targetState.color,
                    { state.value = CardState.MainList },
                    { state.value = CardState.First },
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinJC_FeelingDiary_appTheme {
        MainScreen()
    }
}