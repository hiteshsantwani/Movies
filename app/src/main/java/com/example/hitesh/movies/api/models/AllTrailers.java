package com.example.hitesh.movies.api.models;

/**
 * Created by hitesh on 30-04-2016.
 */
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllTrailers {

    @SerializedName("results")
    private List<MovieTrailer> trailerList;

    public List<MovieTrailer> getTrailerList() {
        return trailerList;
    }

    public static class MovieTrailer {
        @SerializedName("id")
        private String mId;

        @SerializedName("key")
        private String mKey;

        @SerializedName("name")
        private String mTrailerTitle;

        @SerializedName("site")
        private String mSite;

        public String getId() {
            return mId;
        }

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
}