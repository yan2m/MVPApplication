package com.linjy.mvpapplication.usecase;

import android.util.Log;

import com.linjy.mvpapplication.base.BaseUseCase;
import com.linjy.mvpapplication.constant.AppConstant;
import com.linjy.mvpapplication.restful.ApiManager;
import com.linjy.mvpapplication.restful.model.UserIdentity;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by linjy on 2017/12/12.
 */

public class LoginUseCase implements BaseUseCase<String> {
    @Override
    public BaseUseCase execute(String... params) {
        UserIdentity.AuthRequest request = new UserIdentity.AuthRequest();
        request.corp_id = AppConstant.COMPANY_ID;
        request.email = params[0];
        request.password = params[1];
        ApiManager.getInstance().getApi().userAuth(request)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<UserIdentity.AuthResponse>() {
                    @Override
                    public void accept(UserIdentity.AuthResponse authResponse) throws Exception {
                        Log.e("response", authResponse.access_token);
                    }
                });
        return this;
    }
}
