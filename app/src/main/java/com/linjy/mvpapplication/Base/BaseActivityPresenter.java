package com.linjy.mvpapplication.Base;

/**
 * Created by linjy on 2017/12/7.
 */

public class BaseActivityPresenter<T extends BaseView> extends BasePresenter<T> {

    public BaseActivityPresenter(T mView) {
        super(mView);
    }

    public void onActivityCreate() {

    }

    public void onActivityDestroy() {

    }

    public void onActivityResume() {

    }

    public void onActivityPause() {

    }

    public void onActivityStart() {

    }

    public void onActivityStop() {

    }

    public void onActivityRestart() {

    }
}
