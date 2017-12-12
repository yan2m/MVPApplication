package com.linjy.mvpapplication.base;

import android.content.Context;

/**
 * Created by linjy on 2017/12/11.
 */

public abstract class BaseMvpFragment<T extends BaseFragmentPresenter<? extends BaseView>> extends BaseFragment {
    protected T mPresenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        mPresenter = initPresenter();
    }

    public abstract T initPresenter();

}
