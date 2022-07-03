package com.example.androidimpltemplate.usecase

import com.example.androidimpltemplate.model.db.dao.UserDao
import timber.log.Timber
import javax.inject.Inject

class CheckIfUserExistsUseCase @Inject constructor(
    private val userDao: UserDao
) {

    suspend operator fun invoke(email: String): Boolean {
        Timber.d("invoke CheckIfUserExistsUseCase with email = $email")
        return userDao.isRowIsExist(email)
    }
}