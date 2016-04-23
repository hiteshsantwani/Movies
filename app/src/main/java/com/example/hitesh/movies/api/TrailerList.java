package com.example.hitesh.movies.api;

/**
 * Created by hitesh on 23-04-2016.
 */
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TrailerList {

    @SerializedName("results")
    private List<MovieTrailer> trailerList;

    public List<MovieTrailer> getMovieList() {
        return trailerList;
    }
}