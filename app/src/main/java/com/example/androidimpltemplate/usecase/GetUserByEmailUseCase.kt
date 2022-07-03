package com.example.androidimpltemplate.usecase

import com.example.androidimpltemplate.model.db.dao.UserDao
import com.example.androidimpltemplate.model.db.dto.UserDto
import timber.log.Timber
import javax.inject.Inject

open class GetUserByEmailUseCase @Inject constructor(private val userDao: UserDao) {

    open suspend operator fun invoke(email: String): UserDto {
        Timber.d("invoke GetUserByEmailUseCase with email = $email")

        return userDao.findByEmail(email)
    }

}