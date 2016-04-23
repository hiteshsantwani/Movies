package com.example.hitesh.movies.api;

/**
 * Created by hitesh on 23-04-2016.
 */
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * The response from the server is a JSON object that has an array at the key "results"
 */
public class AllMoviesResponse {
    @SerializedName("results")
    List<Movie> movieList;

    public List<Movie> getMovieList() {
        return movieList;
    }
}