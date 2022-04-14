package com.stepanusryan.fetchdata_retrofit.model.weather.sys

import com.google.gson.annotations.SerializedName

data class DataSys (
        @field:SerializedName("type")
        var type:Int ?= null,
        @field:SerializedName("id")
        var id:Int ?= null,
        @field:SerializedName("country")
        var country:String ?= null,
        @field:SerializedName("sunrise")
        var sunrise:Int ?= null,
        @field:SerializedName("sunset")
        var sunset:Int ?= null
        )