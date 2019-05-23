package com.example.lenovo.studio_c.base;

import android.app.Application;

/**
 * Created by Lenovo on 2019/5/22.
 */

public class BaseApp extends Application {
    private static BaseApp app;

    public static BaseApp getApp() {
        return app;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
    }
}
