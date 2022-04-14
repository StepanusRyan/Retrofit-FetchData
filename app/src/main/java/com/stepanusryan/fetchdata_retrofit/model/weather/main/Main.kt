package com.stepanusryan.fetchdata_retrofit.model.weather.main

import com.google.gson.annotations.SerializedName

data class Main (
        @field:SerializedName("temp")
        var temp:Int ?= null,
        @field:SerializedName("feels_like")
        var feels:Int ?= null,
        @field:SerializedName("temp_min")
        var min:Int ?= null,
        @field:SerializedName("temp_max")
        var max:Int ?= null,
        @field:SerializedName("pressure")
        var pressure:Int ?= null,
        @field:SerializedName("humidity")
        var humidity:Int ?= null,
)