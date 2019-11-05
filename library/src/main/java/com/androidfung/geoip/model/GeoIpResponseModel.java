package com.androidfung.geoip.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by fung.lam on 17/11/2015.
 */
public class GeoIpResponseModel {

//    public enum Status{
//        @SerializedName("success")
//        SUCCESS,
//        @SerializedName("fail")
//        FAIL
//    }

//    private String as;
//    private String city;
//    private String country;
//    private String countryCode;
//    private String isp;
//    @SerializedName("lat")
//    private double latitude;
//    @SerializedName("lon")
//    private double longitude;
//    private String org;
//    private String query;
//    private String region;
//    private String regionName;
//    private Status status;
//    private String timezone;
//    private String message;

    private String ip;
    private boolean error;
    private String reason;
    private String city;
    private String region;
    @SerializedName("region_code")
    private String regionCode;
    private String country;
    @SerializedName("country_name")
    private String countryName;
    @SerializedName("continent_code")
    private String continentCode;
    private String postal;
    private double latitude;
    private double longitude;
    @SerializedName("utc_offset")
    private String utcOffset;
    private String languages;
    private String currency;
    @SerializedName("country_calling_code")
    private String countryCallingCode;
    private String timezone;
    private String asn;
    private String org;

    public String toString(){
        return ip;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentCode() {
        return continentCode;
    }

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    public String getPostal() {
        return postal;
    }

    public void setPostal(String postal) {
        this.postal = postal;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getUtcOffset() {
        return utcOffset;
    }

    public void setUtcOffset(String utcOffset) {
        this.utcOffset = utcOffset;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountryCallingCode() {
        return countryCallingCode;
    }

    public void setCountryCallingCode(String countryCallingCode) {
        this.countryCallingCode = countryCallingCode;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAsn() {
        return asn;
    }

    public void setAsn(String asn) {
        this.asn = asn;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }
}
