package com.JPMC.a20210613_hemaladani_nycschools.api

import com.JPMC.a20210613_hemaladani_nycschools.api.objects.School
import com.JPMC.a20210613_hemaladani_nycschools.api.objects.Score
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.concurrent.TimeUnit

interface RetrofitApi {

    companion object {
        val BASE_URL:String="https://data.cityofnewyork.us/resource/"
        //https://data.cityofnewyork.us/resource/f9bf-2cp4.json?dbn=31R080
        var longerTimeoutClient = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(15, TimeUnit.SECONDS)
            .build()
        var gson = GsonBuilder()
            .excludeFieldsWithoutExposeAnnotation()
            .create()
        var retrofitApiInstance = Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(longerTimeoutClient)
            .build()
        fun create(): RetrofitApi {
            return retrofitApiInstance.create(RetrofitApi::class.java)
        }
    }

    @GET("s3k6-pzi2.json")
    fun getSchoolsData(): Call<List<School>>
    @GET("f9bf-2cp4.json?")
    fun getScoreData(@Query("dbn") dbn:String):Call<List<Score>>


}