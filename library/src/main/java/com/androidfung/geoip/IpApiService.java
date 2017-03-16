package com.androidfung.geoip;

import com.androidfung.geoip.model.GeoIpResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by funglam on 3/16/17.
 */
@SuppressWarnings("unused")
public interface IpApiService {
    @GET("json")
    Call<GeoIpResponseModel> getGeoIp();
}
