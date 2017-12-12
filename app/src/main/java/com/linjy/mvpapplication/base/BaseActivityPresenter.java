package com.linjy.mvpapplication.base;

/**
 * Created by linjy on 2017/12/7.
 */

public class BaseActivityPresenter<T extends BaseView> extends BasePresenter<T> {

    public BaseActivityPresenter(T mView) {
        super(mView);
    }

}
