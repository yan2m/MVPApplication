package com.linjy.mvpapplication.base;

import java.lang.ref.WeakReference;

/**
 * Created by linjy on 2017/12/6.
 */

public class BasePresenter<T extends BaseView> {
    protected final String TAG = getClass().getSimpleName();
    private WeakReference<T> mView;


    public BasePresenter(T mView) {
        this.mView = new WeakReference<T>(mView);
    }

    public boolean isViewAttached() {
        return mView != null && mView.get() != null;
    }

    public T getView() {
        if (isViewAttached()) {
            return mView.get();
        } else {
            throw new IllegalStateException("empty view");
        }
    }
}
