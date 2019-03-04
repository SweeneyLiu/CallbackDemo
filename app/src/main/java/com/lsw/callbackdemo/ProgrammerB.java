package com.lsw.callbackdemo;

import android.util.Log;

/**
 * Created by sweeneyliu on 2019/3/4.
 */
public class ProgrammerB {
    public void doWork(Callback callback, String event) {

        Log.e("程序员A告诉程序员B需要干的事：", event);

        Log.e("程序员B：", "干活.....");

        String result = "完成工作";

        //程序员B在这里调用A回调方法，告诉完成任务
        callback.event(result);
    }
}
