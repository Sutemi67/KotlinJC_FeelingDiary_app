package apc.appcradle.kotlinjc_feelingdiary_app.cards

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun ThirdCard(onClick: () -> Unit) {
    LazyColumn(
        modifier = Modifier
            .wrapContentSize()
            .padding(10.dp)
    ) {
        item { ThirdCardListItem("Гнев", Color(0xFFFFC2AA), onClick) }
        item { ThirdCardListItem("Зависть", Color(0xFFBCFFAA), onClick) }
        item { ThirdCardListItem("Ненависть", Color(0xFFE1BEE7), onClick) }
    }
}

@Preview
@Composable
fun Ffsx() {
    ThirdCard {}
}