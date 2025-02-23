package apc.appcradle.kotlinjc_feelingdiary_app.ui

import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.domain.RepositoryInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: RepositoryInterface
) : ViewModel() {

    private val _list = MutableStateFlow(emptyList<FeelDiagram>())
    val list: StateFlow<List<FeelDiagram>> = _list.asStateFlow()

    init {
        loadData()
    }

    fun loadData() {
        viewModelScope.launch(Dispatchers.IO) {
            _list.value = repository.getFeelData()
        }
    }

    fun saveFeelData(feel: String, amount: Float, comment: String, color: Color) {
        viewModelScope.launch(Dispatchers.IO) {
            repository.saveFeelData(feel = feel, amount, comment, color)
        }
    }

    fun clearData() {
        viewModelScope.launch(Dispatchers.IO) {
            repository.clearData()
            _list.value = repository.getFeelData()
        }
    }
}