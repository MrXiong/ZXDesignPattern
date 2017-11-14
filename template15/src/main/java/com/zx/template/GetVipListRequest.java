package com.zx.template;

import android.util.Log;

/**
 * Created by user on 2017/11/14.
 * 获取会员列表
 */

public class GetVipListRequest extends BaseRequest {
    @Override
    protected String getMethod() {
        return "获取会员列表";
    }

    @Override
    public void createRequest() {
        super.createRequest();
        Log.v("tag", "创建会员请求");
    }

    @Override
    public void post(RequestParams params) {
        super.post(params);
        Log.v("tag", "====获取会员=====");
    }
}
