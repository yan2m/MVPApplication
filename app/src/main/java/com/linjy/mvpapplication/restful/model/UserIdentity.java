package com.linjy.mvpapplication.restful.model;

/**
 * Created by linjy on 2017/12/14.
 */

public class UserIdentity {

    public static class AuthResponse {
        public int user_id;
        public String access_token;
        public String refresh_token;
        public int expire_in;
        public String authorize;
    }

    public static class AuthRequest {
        public String corp_id;
        public String email;
        public String password;
    }

    public static class UserTokenRefreshResponse {
        public String access_token;
        public String refresh_token;
        public String expire_in;
    }
}
