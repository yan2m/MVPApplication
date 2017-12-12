package com.linjy.mvpapplication.base;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by linjy on 2017/12/6.
 */

public abstract class BaseMvpActivity<P extends BaseActivityPresenter> extends BaseActivity {
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = initPresenter();
    }

    protected abstract P initPresenter();

}
