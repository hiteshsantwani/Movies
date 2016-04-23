package com.example.hitesh.movies.api;

/**
 * Created by hitesh on 23-04-2016.
 */
import com.google.gson.annotations.SerializedName;

public class MovieTrailer {

    @SerializedName("key")
    private String mKey;

    @SerializedName("name")
    private String mTrailerTitle;

    @SerializedName("site")
    private String mSite;

    public String getKey() {
        return mKey;
    }

    public String getTrailerTitle() {
        return mTrailerTitle;
    }

    public String getSite() {
        return mSite;
    }
}