package com.androidfung.geoip

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by funglam on 3/16/17.
 */
object ServicesManager {
    //    private static final String BASE_URL = "http://ip-api.com/";
    private const val BASE_URL = "https://ipapi.co/"

    @JvmStatic
    val geoIpService: GeoIpService
        get() = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GeoIpService::class.java)
}