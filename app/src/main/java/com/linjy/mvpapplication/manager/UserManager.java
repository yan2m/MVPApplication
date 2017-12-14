package com.linjy.mvpapplication.manager;

import com.linjy.mvpapplication.constant.AppConstant;
import com.linjy.mvpapplication.restful.AuthProvider;
import com.linjy.mvpapplication.restful.HttpConfig;
import com.linjy.mvpapplication.restful.model.UserIdentity;

/**
 * Created by linjy on 2017/12/14.
 */

public class UserManager implements HttpConfig {
    private static UserManager instance;

    private UserManager() {
    }

    public static UserManager getInstance() {
        if (instance == null)
            instance = new UserManager();
        return instance;
    }

    private AuthProvider authProvider = new AuthProvider() {
        @Override
        public String getBaseUrl() {
            return AppConstant.AUTH_URL;
        }

        @Override
        public String getAccessToken() {
            return null;
        }

        @Override
        public UserIdentity.AuthRequest authRequest() {
            return null;
        }

        @Override
        public void authResponse(UserIdentity.AuthResponse authResponse) {

        }

        @Override
        public String getRefreshToken() {
            return null;
        }

        @Override
        public void refreshResponse(UserIdentity.UserTokenRefreshResponse refreshResponse) {

        }

        @Override
        public void onAuthFailure() {

        }
    };

    @Override
    public boolean isLogging() {
        return true;
    }

    @Override
    public AuthProvider getAuthProvider() {
        return authProvider;
    }


}
