package com.example.myapplication.dictionary.domain.model

import com.example.myapplication.dictionary.data.remote.dto.License

data class WordInfo(
    val meanings: List<Meaning>,
    val phonetic: String,
    val word: String
)