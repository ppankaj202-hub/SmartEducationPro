package com.smarteducationpro.app.data.datastore

import android.content.Context
import androidx.datastore.preferences.core.edit
import kotlinx.coroutines.flow.first

class UserPreferencesRepository(
    private val context: Context
) {

    suspend fun saveLanguage(language: String) {
        context.dataStore.edit {
            it[UserPreferences.LANGUAGE] = language
        }
    }

    suspend fun getLanguage(): String {
        return context.dataStore.data.first()[UserPreferences.LANGUAGE] ?: ""
    }

    suspend fun saveBoard(board: String) {
        context.dataStore.edit {
            it[UserPreferences.BOARD] = board
        }
    }

    suspend fun saveMedium(medium: String) {
        context.dataStore.edit {
            it[UserPreferences.MEDIUM] = medium
        }
    }

    suspend fun saveClass(selectedClass: String) {
        context.dataStore.edit {
            it[UserPreferences.CLASS] = selectedClass
        }
    }
}