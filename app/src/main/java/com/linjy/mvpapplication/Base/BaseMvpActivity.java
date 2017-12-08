package com.linjy.mvpapplication.Base;

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
        mPresenter.onActivityCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        mPresenter.onActivityStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.onActivityResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mPresenter.onActivityPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mPresenter.onActivityStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mPresenter.onActivityDestroy();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mPresenter.onActivityRestart();
    }

    protected abstract P initPresenter();

}
