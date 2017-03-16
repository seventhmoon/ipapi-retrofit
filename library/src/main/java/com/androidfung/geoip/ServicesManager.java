package com.androidfung.geoip;

import retrofit2.Retrofit;

/**
 * Created by funglam on 3/16/17.
 */

@SuppressWarnings("unused")
public class ServicesManager {

    private static final String BASE_URL = "http://ip-api.com/";

    public IpApiService getGeoIpService(){
        return new Retrofit.Builder().baseUrl(BASE_URL).build().create(IpApiService.class);
    }
}
