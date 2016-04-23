package com.example.hitesh.movies.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by hitesh on 23-04-2016.
 */
public class MovieAuthService extends Service {
    private MovieAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        mAuthenticator = new MovieAuthenticator(getApplicationContext());
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}