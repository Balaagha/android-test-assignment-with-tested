package com.example.androidimpltemplate.usecase

import com.example.androidimpltemplate.manager.datastore.DatastoreManager
import com.example.androidimpltemplate.utils.DataStore.DATASTORE_LOGGED_IN_EMAIL_KEY
import timber.log.Timber
import javax.inject.Inject

open class AddLoggedInEmailToDatastoreUseCase @Inject constructor(
    private val datastoreManager: DatastoreManager
) {

    open suspend operator fun invoke(email: String) {
        Timber.d("invoke AddLoggedInEmailToDatastoreUseCase with email = $email")
        datastoreManager.addToDatastore(DATASTORE_LOGGED_IN_EMAIL_KEY, email)
    }
}