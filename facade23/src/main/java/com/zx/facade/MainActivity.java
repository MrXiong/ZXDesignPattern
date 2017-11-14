package com.zx.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//外观模式

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobilePhone mobilePhone = new MobilePhone();

        //拍照
        mobilePhone.takePicture();
        //视频聊天
        mobilePhone.videoChat();
    }
}
