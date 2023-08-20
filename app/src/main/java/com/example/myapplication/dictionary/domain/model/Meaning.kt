package com.example.myapplication.dictionary.domain.model

import com.example.myapplication.dictionary.data.remote.dto.DefinitionDto


data class Meaning(
    val antonyms: List<String>,
    val definitions: List<Definition>,
    val partOfSpeech: String,
    val synonyms: List<String>
)
