package com.example.hitesh.movies.data;

/**
 * Created by hitesh on 18-04-2016.
 */
import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class MovieContract {

    // Content Authority => The name of the Content Provider
    public static final String CONTENT_AUTHORITY = "az.aldoziflaj.popmovies";

    // Base content URI to access the data from the Content Provider
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    // Path to the table pointed by MovieTable
    // content://az.aldoziflaj.popmovies/movies
    public static final String PATH_MOVIE = "movies";

    public static final class MovieTable implements BaseColumns {

        // Content URI for the MovieTable
        public static final Uri CONTENT_URI = BASE_CONTENT_URI.buildUpon().appendPath(PATH_MOVIE).build();

        // Constant strings to tell the difference between a list of items (CONTENT_TYPE)
        // and a singe item (CONTENT_ITEM_TYPE)
        public static final String CONTENT_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MOVIE;
        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_MOVIE;

        public static final String TABLE_NAME = "movies";

        // columns
        public static final String COLUMN_TITLE = "title";
        public static final String COLUMN_RELEASE_DATE = "release_date";
        public static final String COLUMN_VOTE_AVERAGE = "vote_average";
        public static final String COLUMN_VOTE_COUNT = "vote_count";
        public static final String COLUMN_DESCRIPTION = "desc";
        public static final String COLUMN_IMAGE_URL = "image_url";
    }
}