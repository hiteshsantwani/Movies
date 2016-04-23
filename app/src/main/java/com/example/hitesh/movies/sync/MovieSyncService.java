package com.example.hitesh.movies.sync;

/**
 * Created by hitesh on 23-04-2016.
 */
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class MovieSyncService extends Service {

    //used as thread-safe lock
    private static final Object sSyncAdapterLock = new Object();
    //"singleton" of the sync adapter
    private static MovieSyncAdapter sMovieSyncAdapter = null;

    @Override
    public void onCreate() {
        synchronized (sSyncAdapterLock) {
            if (sMovieSyncAdapter == null) {
                sMovieSyncAdapter = new MovieSyncAdapter(getApplicationContext(), true);
            }
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return sMovieSyncAdapter.getSyncAdapterBinder();
    }
}