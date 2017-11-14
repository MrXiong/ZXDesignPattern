package com.zx.template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login();
        getVipList();


    }

    private void login() {
        LoginRequest request = new LoginRequest();
        RequestParams params = new RequestParams();
        params.addFormData("username", "张三");
        params.addFormData("password", "123456");
        request.createRequest();
        request.post(params);
    }

    private void getVipList() {
        GetVipListRequest request = new GetVipListRequest();
        RequestParams params = new RequestParams();
        params.addFormData("token", "fjeowjofewfw");
        request.createRequest();
        request.post(params);
    }
}
