package com.example.myapplication.dictionary.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import com.example.myapplication.dictionary.data.local.entity.WordInfoEntity;
import com.example.myapplication.dictionary.data.util.Converters;

@androidx.room.Database(entities = {com.example.myapplication.dictionary.data.local.entity.WordInfoEntity.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.example.myapplication.dictionary.data.util.Converters.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/dictionary/data/local/WordInfoDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dao", "Lcom/example/myapplication/dictionary/data/local/WordInfoDao;", "getDao", "()Lcom/example/myapplication/dictionary/data/local/WordInfoDao;", "app_debug"})
public abstract class WordInfoDatabase extends androidx.room.RoomDatabase {
    
    public WordInfoDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.example.myapplication.dictionary.data.local.WordInfoDao getDao();
}