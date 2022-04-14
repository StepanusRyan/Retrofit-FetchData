package com.stepanusryan.fetchdata_retrofit.model.bmkg

import com.google.gson.annotations.SerializedName

data class Gempa (
        @field:SerializedName("gempa")
        var gempa: DataGempa
        )