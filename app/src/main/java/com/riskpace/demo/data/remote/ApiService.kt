package com.riskpace.demo.data.remote

import com.google.gson.JsonObject
import retrofit2.http.Body
import retrofit2.http.GET

interface ApiService {

    @GET("b/5f316e7d6f8e4e3faf2fa703")
    suspend fun getData(): DemoResponse
}