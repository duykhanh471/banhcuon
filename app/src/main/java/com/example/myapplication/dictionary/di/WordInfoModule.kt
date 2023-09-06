package com.example.myapplication.dictionary.di

import android.app.Application
import androidx.room.Room
import com.example.myapplication.dictionary.data.local.WordInfoDao
import com.example.myapplication.dictionary.data.local.WordInfoDatabase
import com.example.myapplication.dictionary.data.remote.DictionaryAPI
import com.example.myapplication.dictionary.data.repository.WordInfoRepositoryImpl
import com.example.myapplication.dictionary.data.util.Converters
import com.example.myapplication.dictionary.data.util.GsonParser
import com.example.myapplication.dictionary.domain.repository.WordInfoRepository
import com.example.myapplication.dictionary.domain.use_case.GetWordInfo
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object WordInfoModule {
    @Provides
    @Singleton
    fun provideGetWordInfoUseCase(repository: WordInfoRepository) : GetWordInfo {
        return GetWordInfo(repository)
    }

    @Provides
    @Singleton
    fun provideWordInfoRepository(db: WordInfoDatabase, api: DictionaryAPI) : WordInfoRepository {
        return WordInfoRepositoryImpl(api, db.dao)
    }
    @Provides
    @Singleton
    fun provideWordInfoDatabase(app: Application) : WordInfoDatabase {
        return Room.databaseBuilder(
            app,
            WordInfoDatabase::class.java,
            "word_db"
        ).addTypeConverter(Converters(GsonParser(Gson())))
            .build()
    }

    @Provides
    @Singleton
    fun provideDictionaryApi() : DictionaryAPI {
        return Retrofit.Builder()
            .baseUrl(DictionaryAPI.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(DictionaryAPI::class.java)
    }



}