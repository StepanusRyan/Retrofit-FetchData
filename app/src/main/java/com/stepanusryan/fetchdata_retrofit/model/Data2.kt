package com.stepanusryan.fetchdata_retrofit.model

import com.google.gson.annotations.SerializedName

data class Data2 (
    @field:SerializedName("name")
    var name :String ?= null,
    @field:SerializedName("address")
    var address :String ?= null,
    @field:SerializedName("age")
    var age :Int ?= null
)