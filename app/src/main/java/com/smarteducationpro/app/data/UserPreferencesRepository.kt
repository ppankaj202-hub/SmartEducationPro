package com.smarteducationpro.app.data

import android.content.Context
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

private val Context.dataStore by preferencesDataStore("user_preferences")

class UserPreferencesRepository(
    private val context: Context
) {

    companion object {

        val LANGUAGE =
            stringPreferencesKey("language")

        val BOARD =
            stringPreferencesKey("board")

        val MEDIUM =
            stringPreferencesKey("medium")

        val CLASS =
            stringPreferencesKey("class")

    }

    suspend fun saveLanguage(
        language: String
    ) {

        context.dataStore.edit { preferences ->

            preferences[LANGUAGE] = language

        }

    }

    fun getLanguage(): Flow<String> {

        return context.dataStore.data.map { preferences ->

            preferences[LANGUAGE] ?: "en"

        }

    }

    suspend fun saveBoard(
        board: String
    ) {

        context.dataStore.edit {

            it[BOARD] = board

        }

    }

    fun getBoard(): Flow<String> {

        return context.dataStore.data.map {

            it[BOARD] ?: ""

        }

    }

    suspend fun saveMedium(
        medium: String
    ) {

        context.dataStore.edit {

            it[MEDIUM] = medium

        }

    }

    fun getMedium(): Flow<String> {

        return context.dataStore.data.map {

            it[MEDIUM] ?: ""

        }

    }

    suspend fun saveClass(
        className: String
    ) {

        context.dataStore.edit {

            it[CLASS] = className

        }

    }

    fun getClass(): Flow<String> {

        return context.dataStore.data.map {

            it[CLASS] ?: ""

        }

    }

}