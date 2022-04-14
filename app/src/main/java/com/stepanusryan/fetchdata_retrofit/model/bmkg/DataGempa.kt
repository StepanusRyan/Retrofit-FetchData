package com.stepanusryan.fetchdata_retrofit.model.bmkg

import com.google.gson.annotations.SerializedName

data class DataGempa (
        @field:SerializedName("Tanggal")
        var tanggal:String ?= null,
        @field:SerializedName("Jam")
        var jam:String ?= null,
        @field:SerializedName("DateTime")
        var datetime:String ?= null,
        @field:SerializedName("Coordinates")
        var coordinates:String ?= null,
        @field:SerializedName("Lintang")
        var lintang:String ?= null,
        @field:SerializedName("Bujur")
        var bujur:String ?= null,
        @field:SerializedName("Magnitude")
        var magnitude:String ?= null,
        @field:SerializedName("Kedalaman")
        var kedalaman:String ?= null,
        @field:SerializedName("Wilayah")
        var wilayah:String ?= null,
        @field:SerializedName("Potensi")
        var potensi:String ?= null,
        @field:SerializedName("Dirasakan")
        var dirasakan:String ?= null,
        @field:SerializedName("Shakemap")
        var shakemap:String ?= null
)