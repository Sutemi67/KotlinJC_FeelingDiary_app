package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.domain.CardState
import apc.appcradle.kotlinjc_feelingdiary_app.data.mainFeelingsLists
import apc.appcradle.kotlinjc_feelingdiary_app.domain.Feel


@Composable
fun ListOfFeels(feelingsList: List<Feel>, onClick: (CardState) -> Unit) {
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
    ListOfFeels(mainFeelingsLists) { CardState.First }
}