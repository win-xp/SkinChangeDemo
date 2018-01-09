package com.example.xuxiaopeng.skinchangedemo;

import android.app.Application;

import skin.support.SkinCompatManager;

/**
 * Created by xuxiaopeng on 2018/1/9.
 */

public class App extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        SkinCompatManager.withoutActivity(this).loadSkin();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
