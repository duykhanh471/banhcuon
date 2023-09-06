package com.example.myapplication.dictionary.data.util;

import androidx.room.ProvidedTypeConverter;
import androidx.room.TypeConverter;
import com.example.myapplication.dictionary.domain.model.Meaning;
import com.google.gson.reflect.TypeToken;

@androidx.room.ProvidedTypeConverter
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/example/myapplication/dictionary/data/util/Converters;", "", "jsonParser", "Lcom/example/myapplication/dictionary/data/util/JsonParser;", "(Lcom/example/myapplication/dictionary/data/util/JsonParser;)V", "fromMeaningsJson", "", "Lcom/example/myapplication/dictionary/domain/model/Meaning;", "json", "", "toMeaningsJson", "meanings", "app_debug"})
public final class Converters {
    private final com.example.myapplication.dictionary.data.util.JsonParser jsonParser = null;
    
    public Converters(@org.jetbrains.annotations.NotNull
    com.example.myapplication.dictionary.data.util.JsonParser jsonParser) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.util.List<com.example.myapplication.dictionary.domain.model.Meaning> fromMeaningsJson(@org.jetbrains.annotations.NotNull
    java.lang.String json) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.TypeConverter
    public final java.lang.String toMeaningsJson(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.myapplication.dictionary.domain.model.Meaning> meanings) {
        return null;
    }
}