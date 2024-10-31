package com.example.bookshelf10.network

import com.example.bookshelf10.model.BookResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BookApiService {
    @GET("volumes")
    suspend fun searchBooks(
        @Query("q") query: String,
        @Query("maxResults") maxResults: Int = 40
    ): BookResponse
}