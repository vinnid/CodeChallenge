package com.mobiquity.network.response

data class TodaysForecastResponse(
    val base: String,
    val clouds: Clouds,
    val cod: Int,
    val coord: Coord,
    val dt: Int,
    val id: Int,
    val main: Main,
    val name: String,
    val sys: Sys,
    val timezone: Int,
    val visibility: Int,
    val weather: List<Weather>,
    val wind: Wind
)

data class Main(
    val feels_like: Double,
    val humidity: Int,
    val pressure: Int,
    val temp: Double,
    val temp_max: Double,
    val temp_min: Double
)

data class Weather(
    val description: String,
    val icon: String,
    val id: Int,
    val main: String
)

data class Clouds(
    val all: Int
)

data class Coord(
    val lat: Int,
    val lon: Int
)

data class Sys(
    val id: Int,
    val sunrise: Int,
    val sunset: Int,
    val type: Int
)

data class Wind(
    val deg: Int,
    val speed: Double
)