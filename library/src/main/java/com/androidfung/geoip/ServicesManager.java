package com.androidfung.geoip;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by funglam on 3/16/17.
 */

@SuppressWarnings("unused")
public class ServicesManager {

    private static final String BASE_URL = "http://ip-api.com/";

    public static IpApiService getGeoIpService(){
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(IpApiService.class);
    }
}
