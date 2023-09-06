package com.example.myapplication.dictionary.data.local;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import com.example.myapplication.dictionary.data.local.entity.WordInfoEntity;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00052\u0006\u0010\n\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001f\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/myapplication/dictionary/data/local/WordInfoDao;", "", "deleteWordInfo", "", "words", "", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getWordInfo", "Lcom/example/myapplication/dictionary/data/local/entity/WordInfoEntity;", "word", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWordInfo", "info", "app_debug"})
public abstract interface WordInfoDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertWordInfo(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.data.local.entity.WordInfoEntity> info, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "delete from word_table where word in(:words)")
    public abstract java.lang.Object deleteWordInfo(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> words, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "select * from word_table where word like \'%\' || :word || \'%\'")
    public abstract java.lang.Object getWordInfo(@org.jetbrains.annotations.NotNull
    java.lang.String word, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.myapplication.dictionary.data.local.entity.WordInfoEntity>> continuation);
}