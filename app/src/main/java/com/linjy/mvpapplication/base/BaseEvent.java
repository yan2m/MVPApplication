package com.linjy.mvpapplication.base;

/**
 * Created by linjy on 2017/12/11.
 */

public class BaseEvent {
    private Object data;
    private Object arg1;
    private Object arg2;
    private Enum flag;

    public BaseEvent() {
    }

    public BaseEvent(Enum flag) {
        this.flag = flag;
    }

    public BaseEvent(Object data, Enum flag) {
        this.data = data;
        this.flag = flag;
    }

    public BaseEvent(Object data, Object arg1, Enum flag) {
        this.data = data;
        this.arg1 = arg1;
        this.flag = flag;
    }

    public BaseEvent(Object data, Object arg1, Object arg2, Enum flag) {
        this.data = data;
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.flag = flag;
    }

    public Object getData() {
        return data;
    }

    public Object getArg1() {
        return arg1;
    }

    public Object getArg2() {
        return arg2;
    }

    public Enum getFlag() {
        return flag;
    }
}
