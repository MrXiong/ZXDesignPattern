package com.zx.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
第八章：状态模式


我们在MainActivity中点击登录调用LoginTools的forward方法，forward方法里又调用mState里面的forward方法

mState的值默认是LogoutState，在登录页面点击登录，把LoginState对象设置给了mSate。

那么点击转发的时候就会根据状态判断调用LoginState里面的forward方法还是Logout里面的forward方法。
 */

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.forward)
    Button forward;
    @Bind(R.id.logout)
    Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.forward, R.id.logout})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.forward:
                LoginTools.getInstance().forward(MainActivity.this);
                break;
            case R.id.logout:
                LoginTools.getInstance().setState(new LogoutState());
                break;
        }
    }
}
