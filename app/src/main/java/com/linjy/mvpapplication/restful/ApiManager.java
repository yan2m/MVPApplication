package com.linjy.mvpapplication.restful;

import com.linjy.mvpapplication.restful.api.Api;

/**
 * Created by linjy on 2017/12/14.
 */

public class ApiManager {
    private static ApiManager instance;

    private Api api;

    private ApiManager() {
    }

    public void init(HttpConfig config) {
        api = Api.Builder.createRetrofit(config.getAuthProvider(), config.isLogging()).create(Api.class);
    }

    private static class LazyHolder {
        private static final ApiManager INSTANCE = new ApiManager();
    }

    public static ApiManager getInstance() {
        if (instance == null) {
            instance = new ApiManager();
        }
        return instance;
    }

    public Api getApi() {
        return api;
    }
}
