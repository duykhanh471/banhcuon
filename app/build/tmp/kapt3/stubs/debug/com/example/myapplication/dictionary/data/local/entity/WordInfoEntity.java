package com.example.myapplication.dictionary.data.local.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.myapplication.dictionary.domain.model.Meaning;
import com.example.myapplication.dictionary.domain.model.WordInfo;

@androidx.room.Entity(tableName = "word_table")
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ4\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\u0006\u0010\u001b\u001a\u00020\u001cR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001d"}, d2 = {"Lcom/example/myapplication/dictionary/data/local/entity/WordInfoEntity;", "", "word", "", "meanings", "", "Lcom/example/myapplication/dictionary/domain/model/Meaning;", "id", "", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMeanings", "()Ljava/util/List;", "getWord", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Integer;)Lcom/example/myapplication/dictionary/data/local/entity/WordInfoEntity;", "equals", "", "other", "hashCode", "toString", "toWordInfo", "Lcom/example/myapplication/dictionary/domain/model/WordInfo;", "app_debug"})
public final class WordInfoEntity {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String word = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.myapplication.dictionary.domain.model.Meaning> meanings = null;
    @org.jetbrains.annotations.Nullable
    @androidx.room.PrimaryKey(autoGenerate = true)
    private final java.lang.Integer id = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myapplication.dictionary.data.local.entity.WordInfoEntity copy(@org.jetbrains.annotations.NotNull
    java.lang.String word, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.domain.model.Meaning> meanings, @org.jetbrains.annotations.Nullable
    java.lang.Integer id) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public WordInfoEntity(@org.jetbrains.annotations.NotNull
    java.lang.String word, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.domain.model.Meaning> meanings, @org.jetbrains.annotations.Nullable
    java.lang.Integer id) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.myapplication.dictionary.domain.model.Meaning> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.myapplication.dictionary.domain.model.Meaning> getMeanings() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myapplication.dictionary.domain.model.WordInfo toWordInfo() {
        return null;
    }
}