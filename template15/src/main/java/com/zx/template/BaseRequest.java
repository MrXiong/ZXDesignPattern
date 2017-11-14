package com.zx.template;

/**
 * Created by user on 2017/11/14.
 */

public abstract class BaseRequest implements IBaseRequest {

    protected abstract String getMethod();

    @Override
    public void createRequest() {

    }

    @Override
    public void get() {

    }

    @Override
    public void post(RequestParams params) {

    }
}
