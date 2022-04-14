package com.stepanusryan.fetchdata_retrofit.model.weather

import com.google.gson.annotations.SerializedName
import com.stepanusryan.fetchdata_retrofit.model.weather.cloud.Cloud
import com.stepanusryan.fetchdata_retrofit.model.weather.coord.Coord
import com.stepanusryan.fetchdata_retrofit.model.weather.dataweather.DataWeather
import com.stepanusryan.fetchdata_retrofit.model.weather.main.Main
import com.stepanusryan.fetchdata_retrofit.model.weather.sys.Sys
import com.stepanusryan.fetchdata_retrofit.model.weather.wind.Wind

data class Weather (
        @field:SerializedName("coord")
        var coord:Coord,
        @field:SerializedName("weather")
        var weather:List<DataWeather>,
        @field:SerializedName("base")
        var base :String ?= null,
        @field:SerializedName("main")
        var main: Main,
        @field:SerializedName("visibility")
        var visibility :Int ?= null,
        @field:SerializedName("wind")
        var wind:Wind,
        @field:SerializedName("clouds")
        var clouds:Cloud,
        @field:SerializedName("dt")
        var dt :Int ?= null,
        @field:SerializedName("sys")
        var sys :Sys,
        @field:SerializedName("timezone")
        var timezone :Int ?= null,
        @field:SerializedName("id")
        var id :Int ?= null,
        @field:SerializedName("name")
        var name :String ?= null,
        @field:SerializedName("cod")
        var cod :Int ?= null
        )