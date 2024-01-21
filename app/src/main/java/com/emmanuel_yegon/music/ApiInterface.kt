package com.emmanuel_yegon.music

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface {

    @Headers(
        "X-RapidAPI-Key: 99fb3ef9bamshf27216a1c88b175p10e4e0jsnfb90c51d049e",
        "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String): Call<MyData>
}