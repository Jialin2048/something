package com.rainforest.something.tools.persistence

import android.content.Context
import android.content.SharedPreferences
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

/**
 * Author: RaIN
 * Date: 2022/6/12
 * Path: com.rainforest.something.tools.persistence
 * Desc: datastore 工具
 */

//isLogin
val EXAMPLE_COUNTER = intPreferencesKey("example_counter")
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "setting")

//val Context.clearData = Context.dataStore.edit { it.clear() }
class DataStoreTool constructor() {

    suspend fun getValue(context: Context): Int {
        val exampleCounterFlow: Flow<Int?> = context.dataStore.data
            .map { preferences ->
                preferences[EXAMPLE_COUNTER]
            }
    }

}