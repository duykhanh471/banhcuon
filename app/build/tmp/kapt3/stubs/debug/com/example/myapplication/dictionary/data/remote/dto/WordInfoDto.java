package com.example.myapplication.dictionary.data.remote.dto;

import com.example.myapplication.dictionary.data.local.entity.WordInfoEntity;
import com.example.myapplication.dictionary.domain.model.WordInfo;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\n\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003JM\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\n\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0006H\u00d6\u0001J\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020\"R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\n\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006#"}, d2 = {"Lcom/example/myapplication/dictionary/data/remote/dto/WordInfoDto;", "", "meanings", "", "Lcom/example/myapplication/dictionary/data/remote/dto/MeaningDto;", "phonetic", "", "phonetics", "Lcom/example/myapplication/dictionary/data/remote/dto/PhoneticDto;", "sourceUrls", "word", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getMeanings", "()Ljava/util/List;", "getPhonetic", "()Ljava/lang/String;", "getPhonetics", "getSourceUrls", "getWord", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "toWordInfo", "Lcom/example/myapplication/dictionary/domain/model/WordInfo;", "toWordInfoEntity", "Lcom/example/myapplication/dictionary/data/local/entity/WordInfoEntity;", "app_debug"})
public final class WordInfoDto {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.myapplication.dictionary.data.remote.dto.MeaningDto> meanings = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String phonetic = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.myapplication.dictionary.data.remote.dto.PhoneticDto> phonetics = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> sourceUrls = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String word = null;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myapplication.dictionary.data.remote.dto.WordInfoDto copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.data.remote.dto.MeaningDto> meanings, @org.jetbrains.annotations.NotNull
    java.lang.String phonetic, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.data.remote.dto.PhoneticDto> phonetics, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sourceUrls, @org.jetbrains.annotations.NotNull
    java.lang.String word) {
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
    
    public WordInfoDto(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.data.remote.dto.MeaningDto> meanings, @org.jetbrains.annotations.NotNull
    java.lang.String phonetic, @org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.data.remote.dto.PhoneticDto> phonetics, @org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> sourceUrls, @org.jetbrains.annotations.NotNull
    java.lang.String word) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.myapplication.dictionary.data.remote.dto.MeaningDto> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.myapplication.dictionary.data.remote.dto.MeaningDto> getMeanings() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhonetic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.myapplication.dictionary.data.remote.dto.PhoneticDto> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.myapplication.dictionary.data.remote.dto.PhoneticDto> getPhonetics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getSourceUrls() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getWord() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myapplication.dictionary.domain.model.WordInfo toWordInfo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.myapplication.dictionary.data.local.entity.WordInfoEntity toWordInfoEntity() {
        return null;
    }
}