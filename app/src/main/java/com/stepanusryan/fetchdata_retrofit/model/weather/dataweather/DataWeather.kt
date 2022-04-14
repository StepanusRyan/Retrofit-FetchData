package com.stepanusryan.fetchdata_retrofit.model.weather.dataweather

import com.google.gson.annotations.SerializedName

data class DataWeather (
        @field:SerializedName("id")
        var id:Int ?= null,
        @field:SerializedName("main")
        var main:String ?= null,
        @field:SerializedName("description")
        var description:String ?= null,
        @field:SerializedName("icon")
        var icon:String ?= null
        )