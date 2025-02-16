package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.data.Feelings
import apc.appcradle.kotlinjc_feelingdiary_app.data.funFeelingsList


@Composable
fun ListOfFeels(feelingsList: List<Feelings>, onClick: (CardState) -> Unit) {
    LazyColumn(
        modifier = Modifier
            .wrapContentSize()
            .padding(vertical = 60.dp)

    ) {
        items(feelingsList.size) { index ->
            ListItem(
                feelingsList[index].name,
                feelingsList[index].color
            ) {
                onClick(feelingsList[index].returnState)
            }
        }
    }
}

@Preview
@Composable
fun Ffsx() {
    ListOfFeels(funFeelingsList) { CardState.First }
}