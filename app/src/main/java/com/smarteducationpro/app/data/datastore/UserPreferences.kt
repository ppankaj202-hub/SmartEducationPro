package com.smarteducationpro.app.data.datastore

import androidx.datastore.preferences.core.stringPreferencesKey

object UserPreferences {

    val LANGUAGE = stringPreferencesKey("language")

    val BOARD = stringPreferencesKey("board")

    val MEDIUM = stringPreferencesKey("medium")

    val CLASS = stringPreferencesKey("class")
}