package com.linjy.mvpapplication;

import android.os.Bundle;

import com.linjy.mvpapplication.Base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }
}
