package com.androidfung.geoip.model;


import com.google.gson.annotations.SerializedName;

/**
 * Created by seventhmoon on 06/12/2014.
 */
public class AccountTokenResponseModel {

    @SerializedName("user_id")
    private long userId;
    @SerializedName("user_level")
    private int userLevel;
    @SerializedName("token")
    private String token;
    @SerializedName("expiry_date")
    private long expiryDate;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public int getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(int userLevel) {
        this.userLevel = userLevel;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(long expiryDate) {
        this.expiryDate = expiryDate;
    }
}
