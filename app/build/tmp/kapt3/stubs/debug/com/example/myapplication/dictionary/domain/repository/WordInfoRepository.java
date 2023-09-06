package com.example.myapplication.dictionary.domain.repository;

import com.example.myapplication.core.util.Resources;
import com.example.myapplication.dictionary.domain.model.WordInfo;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/example/myapplication/dictionary/domain/repository/WordInfoRepository;", "", "getWordInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/myapplication/core/util/Resources;", "", "Lcom/example/myapplication/dictionary/domain/model/WordInfo;", "word", "", "app_debug"})
public abstract interface WordInfoRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<com.example.myapplication.core.util.Resources<java.util.List<com.example.myapplication.dictionary.domain.model.WordInfo>>> getWordInfo(@org.jetbrains.annotations.NotNull
    java.lang.String word);
}