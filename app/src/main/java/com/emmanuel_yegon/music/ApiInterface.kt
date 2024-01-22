package com.emmanuel_yegon.music

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers(
        "X-RapidAPI-Key: ",
        "X-RapidAPI-Host: ")
    @GET("search")
    fun getData(@Query("q") query: String): Call<MyData>
}
