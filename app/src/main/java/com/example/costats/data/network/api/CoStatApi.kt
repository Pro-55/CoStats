package com.example.costats.data.network.api

import com.example.costats.models.Data
import retrofit2.Response
import retrofit2.http.GET

interface CoStatApi {

    @GET("/summary")
    suspend fun fetchStats(): Response<Data>

    @GET("/users-lists")
    suspend fun fetchList(): Response<Data>

    @GET("/users-profile")
    suspend fun fetchList(): Response<Data>

}