package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.mediumTextStyle


@Composable
fun EmptyListText(){
    Text(
        text = "Сейчас записей нет. Вы можете добавить одну такую, вернувшись на главную",
        modifier = Modifier.padding(horizontal = 20.dp),
        style = mediumTextStyle
    )
}