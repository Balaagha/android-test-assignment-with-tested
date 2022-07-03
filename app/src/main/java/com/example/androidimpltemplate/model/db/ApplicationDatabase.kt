package com.example.androidimpltemplate.model.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidimpltemplate.model.db.dto.UserDto
import com.example.androidimpltemplate.model.db.dao.UserDao

@Database(entities = arrayOf(UserDto::class), version = 1)
abstract class ApplicationDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}