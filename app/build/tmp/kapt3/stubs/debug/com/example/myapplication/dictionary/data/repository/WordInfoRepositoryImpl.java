package com.example.myapplication.dictionary.data.repository;

import android.util.Log;
import com.example.myapplication.core.util.Resources;
import com.example.myapplication.dictionary.data.local.WordInfoDao;
import com.example.myapplication.dictionary.data.remote.DictionaryAPI;
import com.example.myapplication.dictionary.domain.model.WordInfo;
import com.example.myapplication.dictionary.domain.repository.WordInfoRepository;
import kotlinx.coroutines.flow.Flow;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myapplication/dictionary/data/repository/WordInfoRepositoryImpl;", "Lcom/example/myapplication/dictionary/domain/repository/WordInfoRepository;", "api", "Lcom/example/myapplication/dictionary/data/remote/DictionaryAPI;", "dao", "Lcom/example/myapplication/dictionary/data/local/WordInfoDao;", "(Lcom/example/myapplication/dictionary/data/remote/DictionaryAPI;Lcom/example/myapplication/dictionary/data/local/WordInfoDao;)V", "getWordInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/myapplication/core/util/Resources;", "", "Lcom/example/myapplication/dictionary/domain/model/WordInfo;", "word", "", "app_debug"})
public final class WordInfoRepositoryImpl implements com.example.myapplication.dictionary.domain.repository.WordInfoRepository {
    private final com.example.myapplication.dictionary.data.remote.DictionaryAPI api = null;
    private final com.example.myapplication.dictionary.data.local.WordInfoDao dao = null;
    
    public WordInfoRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.data.remote.DictionaryAPI api, @org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.data.local.WordInfoDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public kotlinx.coroutines.flow.Flow<com.example.myapplication.core.util.Resources<java.util.List<com.example.myapplication.dictionary.domain.model.WordInfo>>> getWordInfo(@org.jetbrains.annotations.NotNull
    java.lang.String word) {
        return null;
    }
}