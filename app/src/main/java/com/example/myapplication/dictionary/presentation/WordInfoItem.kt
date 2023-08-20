package com.example.myapplication.dictionary.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.dictionary.domain.model.WordInfo

@Composable
fun WordInfoItem(
    wordInfo: WordInfo,
    modifier: Modifier = Modifier
) {
    Column(modifier = Modifier) {
        Text(
           text = wordInfo.word, fontSize = 24.sp, fontWeight = FontWeight.Bold, color = Color.Black
        )
        Text(text = wordInfo.phonetic, fontWeight = FontWeight.Light)
        Spacer(modifier = Modifier.height(10.dp))
        wordInfo.meanings.forEach { meaning ->
            Text(text = meaning.partOfSpeech, fontSize = 18.sp, fontWeight = FontWeight.Normal, color = Color.Black)
            meaning.definitions.forEachIndexed { index, definition ->
                Text(text = "${index}. ${definition.definition}")
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "${index}. ${definition.antonyms}")
                Spacer(modifier = Modifier.height(5.dp))
                Text(text = "${index}. ${definition.synonyms}")
            }
        }
    }
}