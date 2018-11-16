package com.androidfung.geoip;

import com.androidfung.geoip.model.GeoIpResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

/**
 * Created by funglam on 3/16/17.
 */
@SuppressWarnings("unused")
public interface GeoIpService {
    @GET("json")
    @Headers("User-Agent: java-ipapi-client")
    Call<GeoIpResponseModel> getGeoIp();

    @GET("json/{ipAddress}")
    @Headers("User-Agent: java-ipapi-client")
    Call<GeoIpResponseModel> getGeoIp(@Path("ipAddress") String ipAddress);
}
