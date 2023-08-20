package com.example.myapplication.dictionary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication.dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWordInfo(info: List<WordInfoEntity>)
    @Query("delete from word_table where word in(:words)")
    suspend fun deleteWordInfo(words: List<String>)
    @Query("select * from word_table where word like '%' || word || '%'")
    suspend fun getWordInfo(word: String) : List<WordInfoEntity>
}