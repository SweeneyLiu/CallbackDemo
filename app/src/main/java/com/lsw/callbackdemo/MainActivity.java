package com.lsw.callbackdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 例如程序员 A 和 B 之间需要协作，A 告诉 B 这个任务中间的某个环节需要 B 来完成，并且完成后告诉 A，
 * 这时候程序员 A 就需要告诉 B 一个联系方式，使 B 完成时来通知自己，这个场景就可以使用回调。
 */
public class MainActivity extends AppCompatActivity {

    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init();
            }
        });
    }

    private void initView() {
        btn = (Button) findViewById(R.id.btn);
    }

    private void init() {

        ProgrammerB programmerB = new ProgrammerB();

        ProgrammerA programmerA = new ProgrammerA(programmerB);

        programmerA.doEvent("编写一个列表界面");
    }
}
