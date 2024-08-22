package com.example.cameraxx.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import com.example.cameraxx.MainActivity

object RetrofitClient {
    private const val BASE_URL = "https://fe57-39-120-245-59.ngrok-free.app/"

    private val client = OkHttpClient.Builder().build()

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}