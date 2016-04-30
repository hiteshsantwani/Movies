package com.example.hitesh.movies.fragments;

/**
 * Created by hitesh on 30-04-2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hitesh.movies.R;

/**
 * TODO: Show a GridView of movies marked as favorite
 */
public class FavoritesFragment extends Fragment {

    public FavoritesFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_favorites, container, false);
    }
}
