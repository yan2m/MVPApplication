package com.linjy.mvpapplication;

import android.app.Application;

import com.linjy.mvpapplication.manager.UserManager;
import com.linjy.mvpapplication.restful.ApiManager;

/**
 * Created by linjy on 2017/12/14.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ApiManager.getInstance().init(UserManager.getInstance());
    }
}
