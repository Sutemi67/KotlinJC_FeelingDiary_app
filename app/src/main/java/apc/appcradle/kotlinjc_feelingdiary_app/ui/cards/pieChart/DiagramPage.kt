package apc.appcradle.kotlinjc_feelingdiary_app.ui.cards.pieChart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.ui.MainViewModel
import apc.appcradle.kotlinjc_feelingdiary_app.ui.theme.inactiveBorderField
import org.koin.androidx.compose.koinViewModel

@Composable
fun DiagramPage(
    viewModel: MainViewModel = koinViewModel(),
    onClickBack: () -> Unit
) {
    val data by viewModel.list.collectAsState()
    val isLoading by viewModel.isLoading.collectAsState()
    val context = LocalContext.current
    val viewWidth = 300.dp
    val scrollState = rememberScrollState()

    LaunchedEffect(Unit) { viewModel.loadData() }

    Column(
        modifier = Modifier
            .padding(vertical = 50.dp)
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (isLoading) {
            CircularProgressIndicator(Modifier.size(viewWidth / 2), color = inactiveBorderField)
        } else {
            if (data == emptyList<FeelDiagram>()) {
                EmptyListText()
            } else {
                Diagram(data, viewWidth, context)
            }
            Spacer(modifier = Modifier.size(16.dp))
            Legend(data, viewWidth)
            BottomButtons(data, viewModel, onClickBack)
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun PieChartPreview() {
    DiagramPage(
        viewModel = koinViewModel(),
        onClickBack = {}
    )
}