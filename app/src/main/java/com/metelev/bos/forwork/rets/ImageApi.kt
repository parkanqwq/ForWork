package com.metelev.bos.forwork.rets

import com.metelev.bos.forwork.domain.entity.ImageEntity
import retrofit2.Call
import retrofit2.http.GET

interface ImageApi {
    @GET("task-m-001/list.php")
    fun getImageAsync(): Call<ImageEntity>
}