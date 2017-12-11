package com.linjy.mvpapplication.Base;

import android.content.Context;

/**
 * Created by linjy on 2017/12/11.
 */

public class BaseFragmentPresenter<T extends BaseView> extends BasePresenter<T> {
    public BaseFragmentPresenter(T mView) {
        super(mView);
    }

    public void onFragmentAttached(Context context) {

    }


    public void onFragmentCreate() {

    }

    public void onFragmentCreateView() {

    }

    public void onActivityCreate() {

    }

    public void onFragmentStart() {

    }

    public void onFragmentResume() {

    }

    public void onFragmentPause() {

    }

    public void onFragmentStop() {

    }

    public void onFragmentDestroyView() {

    }

    public void onFragmentDestroy() {

    }

    public void onFragmentDetached() {

    }
}
