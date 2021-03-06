package com.example.hitesh.movies;

/**
 * Created by hitesh on 16-04-2016.
 */
public final class Constants {

    /**
     * Key strings for building URIs to fetch data from the cloud service
     */
    public class Api {
        public static final String API_KEY = "5e796a75143fae639f7eb2716670fc0e";
        public static final String API_BASE_URL = "http://api.themoviedb.org/3/discover/movie";
        public static final String IMAGE_BASE_URL = "http://image.tmdb.org/t/p/";
        public static final String IMAGE_DEFAULT_SIZE = "w185";
        public static final String IMAGE_SIZE_MEDIUM = "w342";

        public static final String ID_KEY = "id";
        public static final String ORIGINAL_TITLE_KEY = "original_title";
        public static final String RELEASE_DATE_KEY = "release_date";
        public static final String POSTER_PATH_KEY = "poster_path";
        public static final String VOTE_AVERAGE_KEY = "vote_average";
        public static final String TOTAL_VOTES_KEY = "vote_count";
        public static final String OVERVIEW_KEY = "overview";
        public static final String SORT_KEY = "sortby";
        public static final String API_KEY_QUERY = "api_key";

        public static final String SORT_BY_POPULARITY = "popularity.desc";
        public static final String SORT_BY_VOTES = "vote_average.desc";
    }

    /**
     * String constants for storing movie data in a HashMap
     * (will be removed later)
     */
    public class Movie {
        public static final String MOVIE_ID = "movie_id";
        public static final String MOVIE_TITLE = "movie_title";
        public static final String MOVIE_POSTER = "movie_poster";
        public static final String MOVIE_RELEASE_DATE = "movie_release_date";
        public static final String MOVIE_RATING = "movie_rating";
        public static final String MOVIE_TOTAL_VOTES = "movie_total_votes";
        public static final String MOVIE_OVERVIEW = "movie_overview";
    }

}