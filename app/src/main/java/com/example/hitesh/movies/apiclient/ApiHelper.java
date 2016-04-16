package com.example.hitesh.movies.apiclient;

/**
 * Created by hitesh on 16-04-2016.
 */
public interface ApiHelper {

    String API_KEY = "5e796a75143fae639f7eb2716670fc0e";
    String API_BASE_URL = "http://api.themoviedb.org/3/discover/movie";
    String IMAGE_BASE_URL = "http://image.tmdb.org/t/p/";

    String ID_KEY = "id";
    String ORIGINAL_TITLE_KEY = "original_title";
    String RELEASE_DATE_KEY = "release_date";
    String POSTER_PATH_KEY = "poster_path";
    String VOTE_AVERAGE_KEY = "vote_average";
    String OVERVIEW_KEY = "overview";
    String SORT_KEY = "overview";
    String API_KEY_QUERY = "api_key";

    String SORT_BY_POPULARITY = "popularity.desc";
    String SORT_BY_VOTES = "vote_average.desc";

    String IMAGE_DEFAULT_SIZE = "w185";

}
