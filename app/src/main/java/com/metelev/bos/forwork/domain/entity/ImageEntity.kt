package com.metelev.bos.forwork.domain.entity

import com.squareup.moshi.Json

data class ImageEntity(
    @field:Json(name = "url") val url: String?
)
