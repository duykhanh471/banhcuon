package com.example.myapplication.dictionary.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myapplication.dictionary.domain.model.Meaning
import com.example.myapplication.dictionary.domain.model.WordInfo

@Entity(tableName = "word_table")
data class WordInfoEntity(
    val word: String,
    val meanings: List<Meaning>,
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
) {
    fun toWordInfo() : WordInfo {
        return WordInfo(
            word = word,
            meanings = meanings
        )
    }
}