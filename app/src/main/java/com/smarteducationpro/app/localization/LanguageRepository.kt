package com.smarteducationpro.app.localization

import kotlinx.coroutines.flow.Flow

interface LanguageRepository {

    suspend fun saveLanguage(
        language: String
    )

    fun getLanguage(): Flow<String>

}