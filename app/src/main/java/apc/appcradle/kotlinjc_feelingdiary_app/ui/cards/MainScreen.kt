package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards

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
import apc.appcradle.kotlinjc_feelingdiary_app.R
import apc.appcradle.kotlinjc_feelingdiary_app.data.angerFeelingsLists
import apc.appcradle.kotlinjc_feelingdiary_app.data.fearFeelingsLists
import apc.appcradle.kotlinjc_feelingdiary_app.data.mainFeelingsLists
import apc.appcradle.kotlinjc_feelingdiary_app.domain.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.ui.MainViewModel
import apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.onefeeldescribing.OneFeelDescribing
import apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart.DiagramPage
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.KotlinJC_FeelingDiary_appTheme
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.funColor200
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.shameColor200
import org.koin.androidx.compose.koinViewModel

@Composable
fun MainScreen(
    viewModel: MainViewModel = koinViewModel()
) {
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
                            state.value = CardState.Diagram
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

                CardState.MainList -> ListOfFeels(mainFeelingsLists) { st -> state.value = st }
                CardState.ListAnger -> ListOfFeels(angerFeelingsLists) { st -> state.value = st }
                CardState.ListFear -> ListOfFeels(fearFeelingsLists) { st -> state.value = st }
//                CardState.ListFun -> ListOfFeels(funFeelingsLists) { st -> state.value = st }
//                CardState.ListLove -> ListOfFeels(loveFeelingsLists) { st -> state.value = st }
//                CardState.ListSad -> ListOfFeels(sadFeelingsLists) { st -> state.value = st }
//                CardState.ListShame -> ListOfFeels(shameFeelingsLists) { st -> state.value = st }
                is CardState.OneFeelDescribing -> OneFeelDescribing(
                    name = targetState.name,
                    color = targetState.color,
                    parentFeel = targetState.parentFeel,
                    onClick1 = { state.value = CardState.MainList },
                    onClick2 = { state.value = CardState.Diagram }
                )

                CardState.Diagram -> DiagramPage { state.value = CardState.First }

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