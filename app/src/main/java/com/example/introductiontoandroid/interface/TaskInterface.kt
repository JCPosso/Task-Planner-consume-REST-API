package com.example.introductiontoandroid.`interface`

import com.example.introductiontoandroid.dto.TaskDto
import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.*

interface TaskInterface {
    @GET
    fun getAll(): List<TaskDto>

    @GET("/{id}")
    fun findById(@Path("id") id:String): TaskDto

    @POST
    fun create(@Body req: RequestBody): Response<ResponseBody>

    @PUT("/{id}")
    fun update(@Body req: RequestBody, @Path("id") id:String): Response<ResponseBody>

    @DELETE("/id")
    fun delete(@Path("id") id: String): Response<ResponseBody>
}