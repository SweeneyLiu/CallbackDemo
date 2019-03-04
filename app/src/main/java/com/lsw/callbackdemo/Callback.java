package com.lsw.callbackdemo;

/**
 * 回调接口
 * 此接口为联系的方式，程序员A必须要实现此接口
 * Created by sweeneyliu on 2019/3/1.
 */
public interface Callback {
    void event(String result);
}
