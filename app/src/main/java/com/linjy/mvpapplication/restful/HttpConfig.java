package com.linjy.mvpapplication.restful;

/**
 * Created by linjy on 2017/12/14.
 */

public interface HttpConfig {
    boolean isLogging();
    AuthProvider getAuthProvider();
}
