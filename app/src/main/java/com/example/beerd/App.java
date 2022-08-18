package com.example.beerd;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class App extends Application {
    private static Application application;
    public static Application getApplication() {
        return application;
    }
    public static Context getContext() {
        return getApplication().getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        App.application = App.this;
        Log.d("APP_HOME", "App onCreate hit!");
    }

}
