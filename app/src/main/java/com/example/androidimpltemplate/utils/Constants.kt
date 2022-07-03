package com.example.androidimpltemplate.utils

import androidx.datastore.preferences.core.stringPreferencesKey

class Constants {

    companion object {

    }

}

object Bundles {
    const val RECIPE_RESULT_KEY = "recipeResultBundle"
}

object DataStore {
    const val DATASTORE_NAME = "datastore"
    private const val DATASTORE_LOGGED_IN_EMAIL = "logged_in_email"
    @JvmField
    val DATASTORE_LOGGED_IN_EMAIL_KEY = stringPreferencesKey(DATASTORE_LOGGED_IN_EMAIL)
}