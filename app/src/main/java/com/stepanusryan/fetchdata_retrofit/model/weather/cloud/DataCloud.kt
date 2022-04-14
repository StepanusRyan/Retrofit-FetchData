package com.stepanusryan.fetchdata_retrofit.model.weather.cloud

import com.google.gson.annotations.SerializedName

data class DataCloud (
        @field:SerializedName("all")
        var all:Int ?= null
        )