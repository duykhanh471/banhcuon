package com.example.myapplication.dictionary.data.local


import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.myapplication.dictionary.data.local.entity.WordInfoEntity
import com.example.myapplication.dictionary.data.util.Converters

@TypeConverters(Converters::class)
@Database(entities = [WordInfoEntity::class], version = 1, exportSchema = false)
abstract class WordInfoDatabase : RoomDatabase(){
    abstract val dao: WordInfoDao
}