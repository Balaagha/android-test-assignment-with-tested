package com.example.androidimpltemplate.usecase

import com.example.androidimpltemplate.model.db.dto.UserDto
import timber.log.Timber
import javax.inject.Inject

open class RegisterUserUseCase @Inject constructor(
    private val addUserToDatabaseUseCase: AddUserToDatabaseUseCase,
    private val checkIfUserExistsUseCase: CheckIfUserExistsUseCase
) {

    open suspend operator fun invoke(email: String, password: String): Result {
        Timber.d("invoke RegisterUserUseCase with email: $email")
        val userExists = checkIfUserExistsUseCase(email)
        return if (!userExists) {
            addUserToDatabaseUseCase(UserDto(email = email, password = password))
            Timber.d("RegisterUserUseCase Success!")
            Result.Success
        } else {
            Timber.d("RegisterUserUseCase Failure!")
            Result.Failure
        }
    }

    sealed class Result {
        object Success : Result()
        object Failure : Result()
    }
}