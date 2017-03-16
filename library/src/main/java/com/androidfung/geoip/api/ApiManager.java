package com.androidfung.geoip.api;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.androidfung.geoip.model.GeoIpResponseModel;
import com.androidfung.geoip.network.GsonObjectRequest;


import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by seventhmoon on 04/12/2014.
 */
public class ApiManager {

    private static final String TAG = ApiManager.class.getSimpleName();

    private static final String ENDPOINT = "http://ip-api.com/json";
    private RequestQueue mRequestQueue;

    public ApiManager(RequestQueue requestQueue) {
        mRequestQueue = requestQueue;
    }

    public void getGeoIpInfo(Response.Listener<GeoIpResponseModel> listener, Response.ErrorListener errorListener){

        GsonObjectRequest gsonReq = new GsonObjectRequest(Request.Method.GET, ENDPOINT
                , GeoIpResponseModel.class, null, listener, errorListener);
        mRequestQueue.add(gsonReq);
    }


    private static String toUrlParams(Map<String, String> params) {
        StringBuilder sb = new StringBuilder();
        for (String key : params.keySet()) {
            try {
                sb.append("&").append(key).append("=").append(URLEncoder.encode(params.get(key), "utf-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString().substring(1);
    }


}
