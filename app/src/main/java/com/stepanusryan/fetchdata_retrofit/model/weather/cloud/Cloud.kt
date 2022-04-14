package com.stepanusryan.fetchdata_retrofit.model.weather.cloud

import com.google.gson.annotations.SerializedName

data class Cloud (
        @field:SerializedName("clouds")
        var clouds:DataCloud
        )