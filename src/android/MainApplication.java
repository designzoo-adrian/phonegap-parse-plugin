package com.parse;

import android.app.Application;
import org.apache.cordova.core.ParsePlugin;

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParsePlugin.initializeParseWithApplication(this);
    }
}