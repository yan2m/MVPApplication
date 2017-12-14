package com.linjy.mvpapplication;

import android.content.Context;
import android.os.Bundle;

import com.linjy.mvpapplication.base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MainPresenter> implements MainView {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected MainPresenter initPresenter() {
        return new MainPresenter(this);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    public Context getContext() {
        return this;
    }
}
