package com.example.myapplication.dictionary.data.util

import java.lang.reflect.Type

interface JsonParser {
    fun <T> fromParser(json: String, type: Type) : T?
    fun <T> toJson(obj: T, type: Type) : String?
}