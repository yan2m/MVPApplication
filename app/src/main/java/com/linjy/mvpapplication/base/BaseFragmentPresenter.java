package com.linjy.mvpapplication.base;

/**
 * Created by linjy on 2017/12/11.
 */

public class BaseFragmentPresenter<T extends BaseView> extends BasePresenter<T> {
    public BaseFragmentPresenter(T mView) {
        super(mView);
    }

}
