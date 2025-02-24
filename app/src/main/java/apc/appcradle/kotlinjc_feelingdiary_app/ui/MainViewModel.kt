package apc.appcradle.kotlinjc_feelingdiary_app.ui

import android.util.Log
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import apc.appcradle.kotlinjc_feelingdiary_app.domain.FeelDiagram
import apc.appcradle.kotlinjc_feelingdiary_app.domain.RepositoryInterface
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: RepositoryInterface
) : ViewModel() {

    private val _list = MutableStateFlow(emptyList<FeelDiagram>())
    val list: StateFlow<List<FeelDiagram>> = _list
    private val _isLoading = MutableStateFlow(false)
    val isLoading: StateFlow<Boolean> = _isLoading

    fun loadData() {
        viewModelScope.launch(Dispatchers.Default) {
            _isLoading.value = true
            _list.value = repository.getFeelData()
            _isLoading.value = false
            Log.d("path", "просто load data")
        }
    }

    fun saveFeelData(
        feel: String,
        secondaryFeel: String,
        amount: Float,
        comment: String,
        color: Color
    ) {
        viewModelScope.launch(Dispatchers.Default) {
            repository.saveFeelData(
                feel = feel,
                secondaryFeel = secondaryFeel,
                amount = amount,
                comment = comment,
                color = color
            )
            _list.value = repository.getFeelData()
            Log.d("path", "загрузка данных после сохранения")

        }
    }

    fun clearData() {
        viewModelScope.launch(Dispatchers.Default) {
            repository.clearData()
            _list.value = repository.getFeelData()
            Log.d("path", "загрузка после очистки данных")
        }
    }
}