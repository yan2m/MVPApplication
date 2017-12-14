package com.linjy.mvpapplication.mvp.presenter;

import com.linjy.mvpapplication.base.BasePresenter;
import com.linjy.mvpapplication.mvp.view.LoginView;
import com.linjy.mvpapplication.usecase.LoginUseCase;

/**
 * Created by linjy on 2017/12/11.
 */

public class LoginPresenter extends BasePresenter<LoginView> {
    public LoginPresenter(LoginView mView) {
        super(mView);
    }

    public void login(String name, String pwd) {
        new LoginUseCase().execute(name, pwd);
    }
}
