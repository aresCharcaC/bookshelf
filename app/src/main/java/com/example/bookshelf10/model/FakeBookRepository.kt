package com.example.bookshelf10.model

import javax.inject.Inject

class FakeBookRepository @Inject constructor() : BookRepository {
    override suspend fun searchBooks(query: String): List<Book> {
        // Datos de prueba para testing
        return listOf(
            Book(
                id = "1",
                title = "Kotlin Programming",
                authors = listOf("John Doe"),
                thumbnail = "https://example.com/image1.jpg"
            ),
            Book(
                id = "2",
                title = "Android Development",
                authors = listOf("Jane Smith"),
                thumbnail = "https://example.com/image2.jpg"
            )
        )
    }
}