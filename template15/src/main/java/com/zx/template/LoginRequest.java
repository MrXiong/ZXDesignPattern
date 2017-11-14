package com.zx.template;

import android.util.Log;

/**
 * Created by user on 2017/11/14.
 */

public class LoginRequest extends BaseRequest {
    @Override
    protected String getMethod() {
        return "loginRequestFunction";
    }

    @Override
    public void createRequest() {
        super.createRequest();
        Log.v("tag", "创建请求");
    }

    @Override
    public void post(RequestParams params) {
        super.post(params);
        Log.v("tag", "====登录=====");
    }
}
