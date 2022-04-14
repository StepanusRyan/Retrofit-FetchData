package com.stepanusryan.fetchdata_retrofit.singleton

import com.stepanusryan.fetchdata_retrofit.model.Data1
import com.stepanusryan.fetchdata_retrofit.model.Data2
import com.stepanusryan.fetchdata_retrofit.model.Data3
import com.stepanusryan.fetchdata_retrofit.model.bmkg.InfoGempa
import com.stepanusryan.fetchdata_retrofit.model.weather.Weather
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface API {
    @GET("v3/c57c7cdc-cb86-48dd-92ef-ffb1d16fa4cb")
    fun getData() : Call<Data1>
    @GET("v3/cfd87706-e159-45da-a1d5-a137375b68e9")
    fun getData2() : Call<List<Data2>>
    @GET("v3/89419baf-1264-456c-b7b8-ec18c214663c")
    fun getData3() : Call<Data3>
    @GET("v3/7a5baca9-585e-43ee-8639-e42091563a94")
    fun getData4() : Call<InfoGempa>
    @GET("v3/512358a7-1b80-4608-a108-d56dc8b02349")
    fun getData5() : Call<Weather>
}