package com.example.hitesh.movies;

/**
 * Created by hitesh on 18-04-2016.
 */
import android.content.ContentValues;
import android.database.Cursor;
import android.test.AndroidTestCase;

import java.util.Map;
import java.util.Set;

import com.example.hitesh.movies.data.MovieContract;

/**
 * Utility methods used for testing
 */
public class TestUtils extends AndroidTestCase {

    /**
     * Create a stub movie to test insertion into the DB
     *
     * @return A ContentValues instance with the data for the movie
     */
    public static ContentValues createStubMovie() {
        ContentValues cv = new ContentValues();

        cv.put(MovieContract.MovieTable.COLUMN_TITLE, "Interstellar");

        cv.put(MovieContract.MovieTable.COLUMN_RELEASE_DATE,
                Utility.releaseDateFormatter("2014-10-26"));

        cv.put(MovieContract.MovieTable.COLUMN_VOTE_AVERAGE, 8.8);

        cv.put(MovieContract.MovieTable.COLUMN_VOTE_COUNT, 1234);

        cv.put(MovieContract.MovieTable.COLUMN_DESCRIPTION, "lorem ipsum dolor");

        cv.put(MovieContract.MovieTable.COLUMN_IMAGE_URL, "/img_of_interstellar.jpg");

        return cv;
    }

    /**
     * Test if the data inserted into the database are the same with the one read
     *
     * @param errorMessage   Message to print if the data doesn't match
     * @param cursor         A database Cursor holding the data queried
     * @param insertedValues The pre-inserted values, which should be the same with those from the cursor
     */
    public static void validateInsertedData(String errorMessage, Cursor cursor, ContentValues insertedValues) {
        Set<Map.Entry<String, Object>> valueSet = insertedValues.valueSet();

        for (Map.Entry<String, Object> entry : valueSet) {
            String colName = entry.getKey();
            int idx = cursor.getColumnIndex(colName);
            assertFalse("Column '" + colName + "' not found. " + errorMessage, idx == -1);

            String expectedValue = entry.getValue().toString();
            String value = cursor.getString(idx);

            assertEquals("Value read doesn't match the expected value" + errorMessage, expectedValue, value);
        }

    }
}