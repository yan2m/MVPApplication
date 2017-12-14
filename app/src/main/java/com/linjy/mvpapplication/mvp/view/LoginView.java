package com.linjy.mvpapplication.mvp.view;

import com.linjy.mvpapplication.base.BaseView;

/**
 * Created by linjy on 2017/12/11.
 */

public interface LoginView extends BaseView {
    void loginSuccess();

    void loginError();
}
