package com.example.myapplication.dictionary.data.repository

import com.example.myapplication.core.util.Resources
import com.example.myapplication.dictionary.data.local.WordInfoDao
import com.example.myapplication.dictionary.data.remote.DictionaryAPI
import com.example.myapplication.dictionary.domain.model.WordInfo
import com.example.myapplication.dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class WordInfoRepositoryImpl(
    private val api: DictionaryAPI,
    private val dao: WordInfoDao
) : WordInfoRepository {
    override fun getWordInfo(word: String): Flow<Resources<List<WordInfo>>> = flow {
        emit(Resources.Loading())
        val wordInfo = dao.getWordInfo(word).map { it.toWordInfo() }
        emit(Resources.Loading(data = wordInfo))

        try {
            val remoteWordInfo = api.getWordMeaning(word)
            dao.deleteWordInfo(remoteWordInfo.map{it.word})
            dao.insertWordInfo(remoteWordInfo.map{it.toWordInfoEntity()})
        } catch(e : HttpException) {
            emit(Resources.Error(
              message = "HTTP error, please try again",
                data = wordInfo
            ))
        } catch(e: IOException) {
            emit(Resources.Error(
                message = "IOException, please try again",
                data = wordInfo
            ))
        }

        val newWordInfo = dao.getWordInfo(word).map {
            it.toWordInfo()
        }
        emit(Resources.Success(newWordInfo))
    }

}