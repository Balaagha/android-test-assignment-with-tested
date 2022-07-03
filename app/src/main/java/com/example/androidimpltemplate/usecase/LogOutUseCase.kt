package com.example.androidimpltemplate.usecase

import com.example.androidimpltemplate.manager.datastore.DatastoreManager
import com.example.androidimpltemplate.utils.DataStore.DATASTORE_LOGGED_IN_EMAIL_KEY
import timber.log.Timber
import javax.inject.Inject

class LogOutUseCase @Inject constructor(
    private val datastoreManager: DatastoreManager
) {

    suspend operator fun invoke() {
        Timber.d("invoke LogOutUseCase")
        datastoreManager.removeFromDatastore(DATASTORE_LOGGED_IN_EMAIL_KEY)
    }
}