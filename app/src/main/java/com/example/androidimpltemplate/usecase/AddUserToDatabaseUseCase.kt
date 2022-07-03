package com.example.androidimpltemplate.usecase

import com.example.androidimpltemplate.model.db.dao.UserDao
import com.example.androidimpltemplate.model.db.dto.UserDto
import timber.log.Timber
import javax.inject.Inject

class AddUserToDatabaseUseCase @Inject constructor(
    private val userDao: UserDao
) {

    suspend operator fun invoke(userDto: UserDto) {
        Timber.d("invoke AddUserToDatabaseUseCase with userDto = $userDto")
        userDao.insert(userDto)
    }
}