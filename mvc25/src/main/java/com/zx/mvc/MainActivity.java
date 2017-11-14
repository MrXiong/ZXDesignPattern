package com.zx.mvc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//mvc更适合规模比较大的项目：比如UI系统框架

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
