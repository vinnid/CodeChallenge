package com.mobiquity.network.request

data class FiveDaysForecastRequest(
    val lat:Double ,
    val long:Double,
    val appId:String,
    val units:String
)
