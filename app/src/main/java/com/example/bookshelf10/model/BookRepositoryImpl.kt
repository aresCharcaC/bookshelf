package com.example.bookshelf10.model

import com.example.bookshelf10.network.BookApiService
import javax.inject.Inject

class BookRepositoryImpl @Inject constructor(
    private val bookApiService: BookApiService
) : BookRepository {
    override suspend fun searchBooks(query: String): List<Book> {
        return try {
            val response = bookApiService.searchBooks(query)
            response.items.map { volumeInfo ->
                Book(
                    id = volumeInfo.id,
                    title = volumeInfo.info.title,
                    authors = volumeInfo.info.authors ?: emptyList(),
                    thumbnail = volumeInfo.info.images?.thumbnail?.replace("http:", "https:") ?: ""
                )
            }
        } catch (e: Exception) {
            emptyList()
        }
    }
}