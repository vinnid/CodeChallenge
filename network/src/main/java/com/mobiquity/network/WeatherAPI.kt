package com.mobiquity.network

import com.mobiquity.network.response.TodaysForecastResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherAPI {

    @GET("/weather")
    fun getTodayWeatherData(
        @Query("lat")
        lat:Double ,
        @Query("lon")
        long:Double,
        @Query("appid")
        appId:String = Constants.API_KEY
    ):Response<TodaysForecastResponse>

    @GET("/forecast5")
    fun getFiveDaysForeCastData(
        @Query("lat")
        lat:Double ,
        @Query("lon")
        long:Double,
        @Query("appid")
        appId:String = Constants.API_KEY,
        @Query("unit")
        units: String
    ): Response<TodaysForecastResponse>
}