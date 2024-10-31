package com.example.bookshelf10.model

import com.google.gson.annotations.SerializedName

data class BookResponse(
    val items: List<VolumeInfo> = emptyList()
)

data class VolumeInfo(
    val id: String,
    @SerializedName("volumeInfo")
    val info: BookInfo
)

data class BookInfo(
    val title: String,
    val authors: List<String>? = null,
    @SerializedName("imageLinks")
    val images: ImageLinks? = null
)

data class ImageLinks(
    val thumbnail: String? = null
)