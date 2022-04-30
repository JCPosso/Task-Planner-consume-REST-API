package com.example.introductiontoandroid.dto.auth

import com.example.introductiontoandroid.`interface`.StorageInterface
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response

class AuthInterceptor(storage: StorageInterface) :Interceptor {

    private var storage: StorageInterface = storage
    override fun intercept(chain: Interceptor.Chain): Response {
        val token: String = storage.getToken()
        val builder: Request.Builder = chain.request().newBuilder()
        if (token.isNotEmpty()) {
           builder.addHeader("Authorization", "Bearer $token")
        }
        return chain.proceed(builder.build())
    }
}