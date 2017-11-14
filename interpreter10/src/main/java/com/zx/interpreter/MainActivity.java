package com.zx.interpreter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

//第十章 解释器模式 解释器模式是一种用的比较少的行为型模式
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator c = new Calculator("22 + 553 + 83 + 5");
        System.out.println("计算结果："+c.calculate());

    }
}
