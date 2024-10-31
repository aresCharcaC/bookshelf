package com.example.bookshelf10.model

data class Book(
    val id: String,
    val title: String,
    val authors: List<String> = emptyList(),
    val thumbnail: String = ""
)