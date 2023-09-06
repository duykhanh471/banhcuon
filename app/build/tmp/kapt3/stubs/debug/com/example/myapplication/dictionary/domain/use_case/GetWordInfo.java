package com.example.myapplication.dictionary.domain.use_case;

import com.example.myapplication.core.util.Resources;
import com.example.myapplication.dictionary.domain.model.WordInfo;
import com.example.myapplication.dictionary.domain.repository.WordInfoRepository;
import kotlinx.coroutines.flow.Flow;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/myapplication/dictionary/domain/use_case/GetWordInfo;", "", "repository", "Lcom/example/myapplication/dictionary/domain/repository/WordInfoRepository;", "(Lcom/example/myapplication/dictionary/domain/repository/WordInfoRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/myapplication/core/util/Resources;", "", "Lcom/example/myapplication/dictionary/domain/model/WordInfo;", "word", "", "app_debug"})
public final class GetWordInfo {
    private final com.example.myapplication.dictionary.domain.repository.WordInfoRepository repository = null;
    
    public GetWordInfo(@org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.domain.repository.WordInfoRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.myapplication.core.util.Resources<java.util.List<com.example.myapplication.dictionary.domain.model.WordInfo>>> invoke(@org.jetbrains.annotations.NotNull
    java.lang.String word) {
        return null;
    }
}