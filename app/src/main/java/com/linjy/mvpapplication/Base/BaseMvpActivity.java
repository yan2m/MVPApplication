package com.linjy.mvpapplication.Base;

import android.os.Bundle;
import android.support.annotation.Nullable;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Created by linjy on 2017/12/6.
 */

public abstract class BaseMvpActivity<P extends BasePresenter> extends BaseActivity {
    private P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initPresenter();
    }

    private void initPresenter() {
        Type superclassType = getClass().getGenericSuperclass();
        Type[] paramTypes = ((ParameterizedType) superclassType).getActualTypeArguments();
        Class<P> clz = (Class<P>) paramTypes[0];
        try {
            mPresenter = clz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
