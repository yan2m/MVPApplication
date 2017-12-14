package com.linjy.mvpapplication.ui.module;

import android.content.Context;
import android.widget.EditText;

import com.linjy.mvpapplication.R;
import com.linjy.mvpapplication.base.BaseMvpActivity;
import com.linjy.mvpapplication.mvp.presenter.LoginPresenter;
import com.linjy.mvpapplication.mvp.view.LoginView;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by linjy on 2017/12/11.
 */

public class LoginActivity extends BaseMvpActivity<LoginPresenter> implements LoginView {
    @BindView(R.id.login_name)
    EditText et_name;
    @BindView(R.id.login_pwd)
    EditText et_password;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected LoginPresenter initPresenter() {
        return new LoginPresenter(this);
    }

    @Override
    public Context getContext() {
        return null;
    }

    @Override
    public void loginSuccess() {

    }

    @Override
    public void loginError() {

    }

    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        String name = et_name.getText().toString().trim();
        String pwd = et_password.getText().toString().trim();
        mPresenter.login(name, pwd);
    }
}
