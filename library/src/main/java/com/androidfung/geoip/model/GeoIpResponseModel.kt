package com.androidfung.geoip.model

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

/**
 * Created by fung.lam on 17/11/2015.
 */
data class GeoIpResponseModel(
        var ip: String? = null,
        var isError: Boolean = false,
        var reason: String? = null,
        var city: String? = null,
        var region: String? = null,
        @SerializedName("region_code")
    var regionCode: String? = null,
        var country: String? = null,
        @SerializedName("country_name")
    var countryName: String? = null,
        @SerializedName("continent_code")
    var continentCode: String? = null,
        var postal: String? = null,
        var latitude: Double = 0.0,
        var longitude: Double = 0.0,
        @SerializedName("utc_offset")
    var utcOffset: String? = null,
        var languages: String? = null,
        var currency: String? = null,
        @SerializedName("country_calling_code")
    var countryCallingCode: String? = null,
        var timezone: String? = null,
        var asn: String? = null,
        var org: String? = null
        ) {
    override fun toString(): String {
        return Gson().toJson(this)
//        return "GeoIpResponseModel{" +
//                "ip='" + ip + '\'' +
//                ", error=" + isError +
//                ", reason='" + reason + '\'' +
//                ", city='" + city + '\'' +
//                ", region='" + region + '\'' +
//                ", regionCode='" + regionCode + '\'' +
//                ", country='" + country + '\'' +
//                ", countryName='" + countryName + '\'' +
//                ", continentCode='" + continentCode + '\'' +
//                ", postal='" + postal + '\'' +
//                ", latitude=" + latitude +
//                ", longitude=" + longitude +
//                ", utcOffset='" + utcOffset + '\'' +
//                ", languages='" + languages + '\'' +
//                ", currency='" + currency + '\'' +
//                ", countryCallingCode='" + countryCallingCode + '\'' +
//                ", timezone='" + timezone + '\'' +
//                ", asn='" + asn + '\'' +
//                ", org='" + org + '\'' +
//                '}'
    }
}

