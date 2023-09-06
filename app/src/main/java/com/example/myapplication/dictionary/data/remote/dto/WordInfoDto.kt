package com.example.myapplication.dictionary.data.remote.dto

import com.example.myapplication.dictionary.data.local.entity.WordInfoEntity
import com.example.myapplication.dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val sourceUrls: List<String>,
    val word: String
) {
    fun toWordInfo() : WordInfo {
        return WordInfo(
            meanings = meanings.map{it.toMeaning()},
            word = word
        )
    }
    fun toWordInfoEntity() : WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map{it.toMeaning()},
            word = word,
        )
    }
}