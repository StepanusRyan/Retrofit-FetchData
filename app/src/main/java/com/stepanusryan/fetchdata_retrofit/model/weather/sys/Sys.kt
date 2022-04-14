package com.stepanusryan.fetchdata_retrofit.model.weather.sys

import com.google.gson.annotations.SerializedName

data class Sys (
        @field:SerializedName("sys")
        var sys: DataSys
        )