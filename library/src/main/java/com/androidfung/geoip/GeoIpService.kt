package com.androidfung.geoip

import com.androidfung.geoip.model.GeoIpResponseModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path

/**
 * Created by funglam on 3/16/17.
 */
interface GeoIpService {
    @get:Headers("User-Agent: java-ipapi-client")
    @get:GET("json")
    val geoIp: Call<GeoIpResponseModel?>?

    @GET("json/{ipAddress}")
    @Headers("User-Agent: java-ipapi-client")
    fun getGeoIp(@Path("ipAddress") ipAddress: String?): Call<GeoIpResponseModel?>?
}