package com.example.androidimpltemplate.usecase

import com.example.androidimpltemplate.model.domain.User
import com.example.androidimpltemplate.manager.datastore.DatastoreManager
import com.example.androidimpltemplate.utils.DataStore.DATASTORE_LOGGED_IN_EMAIL_KEY
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ObserveLoggedInUserUseCase @Inject constructor(
    private val datastoreManager: DatastoreManager
) {

    operator fun invoke(): Flow<User?> {
        return datastoreManager.observeKeyValue(DATASTORE_LOGGED_IN_EMAIL_KEY).map {
            if (it != null) {
                User(it)
            } else {
                null
            }
        }
    }
}