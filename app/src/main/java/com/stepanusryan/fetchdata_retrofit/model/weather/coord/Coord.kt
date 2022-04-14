package com.stepanusryan.fetchdata_retrofit.model.weather.coord

import com.google.gson.annotations.SerializedName

data class Coord (
        @field:SerializedName("lon")
        var lon :Float ?= null,
        @field:SerializedName("lat")
        var lat :Float ?= null
)