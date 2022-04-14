package com.stepanusryan.fetchdata_retrofit.model.weather.wind

import com.google.gson.annotations.SerializedName

data class DataWind (
        @field:SerializedName("speed")
        var speed:Int ?= null,
        @field:SerializedName("deg")
        var deg:Int ?= null
        )