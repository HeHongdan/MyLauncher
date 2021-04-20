package com.jchun.mylauncher.activity;

import android.app.Application;

import net.tsz.afinal.FinalBitmap;

public class MyApplication extends Application {
    private static MyApplication instacne = null;
    public FinalBitmap fb;
    @Override
    public void onCreate() {
        super.onCreate();
        fb = FinalBitmap.create(getApplicationContext());
        instacne = this;
    }

    public static MyApplication getInstance() {
        return instacne;
    }
}
