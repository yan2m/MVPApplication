package com.linjy.mvpapplication.Base;

/**
 * Created by linjy on 2017/12/11.
 */

public interface BaseUseCase<T> {
    BaseUseCase execute(T... params);
}
