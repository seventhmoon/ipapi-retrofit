package com.androidfung.geoip.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by seventhmoon on 06/12/2014.
 */
public class PlaylistRequestResponseModel {

    @SerializedName("m3u8")
    private String playlist;
    @SerializedName("m3u8_token")
    private String playlistToken;
    @SerializedName("ads_total_duration")
    private int adsDuration;
    @SerializedName("ads_cat")
    private int[] adsCategories;
    @SerializedName("track_points")
    private int[] trackPoints;

    public String getPlaylist() {
        return playlist;
    }

    public void setPlaylist(String playlist) {
        this.playlist = playlist;
    }

    public String getPlaylistToken() {
        return playlistToken;
    }

    public void setPlaylistToken(String playlistToken) {
        this.playlistToken = playlistToken;
    }

    public int getAdsDuration() {
        return adsDuration;
    }

    public void setAdsDuration(int adsDuration) {
        this.adsDuration = adsDuration;
    }

    public int[] getAdsCategories() {
        return adsCategories;
    }

    public void setAdsCategories(int[] adsCategories) {
        this.adsCategories = adsCategories;
    }

    public int[] getTrackPoints() {
        return trackPoints;
    }

    public void setTrackPoints(int[] trackPoints) {
        this.trackPoints = trackPoints;
    }
}
