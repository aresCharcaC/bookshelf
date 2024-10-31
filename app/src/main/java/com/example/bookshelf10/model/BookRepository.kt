package com.example.bookshelf10.model

import kotlinx.coroutines.flow.Flow

interface BookRepository {
    suspend fun searchBooks(query: String): List<Book>
}