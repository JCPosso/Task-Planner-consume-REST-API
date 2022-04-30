package com.example.introductiontoandroid.`interface`

import com.example.introductiontoandroid.dto.auth.TokenDto
import okhttp3.RequestBody
import retrofit2.http.*

interface AuthInterface {
    @POST
    fun login(@Body requestBody: RequestBody): TokenDto
}