package com.stepanusryan.fetchdata_retrofit.model

import com.google.gson.annotations.SerializedName

data class Data3(
        @field:SerializedName("employee")
        var employee:List<Data2>
)

