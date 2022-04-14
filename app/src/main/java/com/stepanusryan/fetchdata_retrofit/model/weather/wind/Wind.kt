package com.stepanusryan.fetchdata_retrofit.model.weather.wind

import com.google.gson.annotations.SerializedName

data class Wind (
        @field:SerializedName("wind")
        var wind: DataWind
        )