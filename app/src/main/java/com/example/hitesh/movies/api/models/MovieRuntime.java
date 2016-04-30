package com.example.hitesh.movies.api.models;

/**
 * Created by hitesh on 23-04-2016.
 */
import com.google.gson.annotations.SerializedName;

public class MovieRuntime {

    @SerializedName("runtime")
    private int mRuntime;

    public int getRuntime() {
        return mRuntime;
    }
}