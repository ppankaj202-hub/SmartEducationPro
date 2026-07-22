package com.smarteducationpro.app.feature.language

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class LanguageViewModel : ViewModel() {

    private val _uiState = MutableStateFlow(LanguageUiState())
    val uiState: StateFlow<LanguageUiState> = _uiState

    fun selectLanguage(language: String) {
        _uiState.value = _uiState.value.copy(
            selectedLanguage = language
        )
    }

}