package com.example.myapplication.dictionary.di;

import android.app.Application;
import androidx.room.Room;
import com.example.myapplication.dictionary.data.local.WordInfoDao;
import com.example.myapplication.dictionary.data.local.WordInfoDatabase;
import com.example.myapplication.dictionary.data.remote.DictionaryAPI;
import com.example.myapplication.dictionary.data.repository.WordInfoRepositoryImpl;
import com.example.myapplication.dictionary.data.util.Converters;
import com.example.myapplication.dictionary.data.util.GsonParser;
import com.example.myapplication.dictionary.domain.repository.WordInfoRepository;
import com.example.myapplication.dictionary.domain.use_case.GetWordInfo;
import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Singleton;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/myapplication/dictionary/di/WordInfoModule;", "", "()V", "provideDictionaryApi", "Lcom/example/myapplication/dictionary/data/remote/DictionaryAPI;", "provideGetWordInfoUseCase", "Lcom/example/myapplication/dictionary/domain/use_case/GetWordInfo;", "repository", "Lcom/example/myapplication/dictionary/domain/repository/WordInfoRepository;", "provideWordInfoDatabase", "Lcom/example/myapplication/dictionary/data/local/WordInfoDatabase;", "app", "Landroid/app/Application;", "provideWordInfoRepository", "db", "api", "app_debug"})
@dagger.Module
public final class WordInfoModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.myapplication.dictionary.di.WordInfoModule INSTANCE = null;
    
    private WordInfoModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.myapplication.dictionary.domain.use_case.GetWordInfo provideGetWordInfoUseCase(@org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.domain.repository.WordInfoRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.myapplication.dictionary.domain.repository.WordInfoRepository provideWordInfoRepository(@org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.data.local.WordInfoDatabase db, @org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.data.remote.DictionaryAPI api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.myapplication.dictionary.data.local.WordInfoDatabase provideWordInfoDatabase(@org.jetbrains.annotations.NotNull
    android.app.Application app) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.myapplication.dictionary.data.remote.DictionaryAPI provideDictionaryApi() {
        return null;
    }
}