package com.example.myapplication.dictionary.domain.repository

import com.example.myapplication.core.util.Resources
import com.example.myapplication.dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String) : Flow<Resources<List<WordInfo>>>
}