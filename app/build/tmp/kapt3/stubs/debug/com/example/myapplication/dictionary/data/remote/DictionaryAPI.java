package com.example.myapplication.dictionary.data.remote;

import com.example.myapplication.dictionary.data.remote.dto.WordInfoDto;
import retrofit2.http.GET;
import retrofit2.http.Path;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/myapplication/dictionary/data/remote/DictionaryAPI;", "", "getWordMeaning", "", "Lcom/example/myapplication/dictionary/data/remote/dto/WordInfoDto;", "word", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface DictionaryAPI {
    @org.jetbrains.annotations.NotNull
    public static final com.example.myapplication.dictionary.data.remote.DictionaryAPI.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String BASE_URL = "https://api.dictionaryapi.dev/";
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "/api/v2/entries/en/{word}")
    public abstract java.lang.Object getWordMeaning(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Path(value = "word")
    java.lang.String word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.dictionary.data.remote.dto.WordInfoDto>> continuation);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/myapplication/dictionary/data/remote/DictionaryAPI$Companion;", "", "()V", "BASE_URL", "", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String BASE_URL = "https://api.dictionaryapi.dev/";
        
        private Companion() {
            super();
        }
    }
}