package com.example.myapplication.dictionary.domain.use_case

import com.example.myapplication.core.util.Resources
import com.example.myapplication.dictionary.domain.model.WordInfo
import com.example.myapplication.dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo (
    private val repository: WordInfoRepository
) {
    operator fun invoke(word: String): Flow<Resources<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)

    }
}