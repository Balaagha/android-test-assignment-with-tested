package com.example.androidimpltemplate.di

import android.content.Context
import androidx.room.Room
import com.example.androidimpltemplate.model.db.ApplicationDatabase
import com.example.androidimpltemplate.model.db.dao.UserDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataBaseModule {

    @Provides
    @Singleton
    fun applicationDatabase(@ApplicationContext context: Context): ApplicationDatabase {
        return Room
            .databaseBuilder(context, ApplicationDatabase::class.java, "database")
            .build()
    }

    @Provides
    @Singleton
    fun userDao(applicationDatabase: ApplicationDatabase): UserDao {
        return applicationDatabase.userDao()
    }

}

