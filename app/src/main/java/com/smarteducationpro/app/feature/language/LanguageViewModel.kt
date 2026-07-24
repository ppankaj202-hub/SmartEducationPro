package com.smarteducationpro.app.feature.language

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.smarteducationpro.app.data.UserPreferencesRepository
import kotlinx.coroutines.launch

class LanguageViewModel(
    application: Application
) : AndroidViewModel(application) {

    private val repository =
        UserPreferencesRepository(application)

    fun saveLanguage(
        language: String
    ) {

        viewModelScope.launch {

            repository.saveLanguage(language)

        }

    }

}