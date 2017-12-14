package com.linjy.mvpapplication.restful;

import com.linjy.mvpapplication.restful.model.UserIdentity;

/**
 * Created by linjy on 2017/12/14.
 */

public interface AuthProvider {
    String getBaseUrl();
    String getAccessToken();
    UserIdentity.AuthRequest authRequest();
    void authResponse(UserIdentity.AuthResponse authResponse);
    String getRefreshToken();
    void refreshResponse(UserIdentity.UserTokenRefreshResponse refreshResponse);
    void onAuthFailure();
}
