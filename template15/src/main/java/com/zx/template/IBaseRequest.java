package com.zx.template;

/**
 * Created by user on 2017/11/14.
 */

public interface IBaseRequest {
    void createRequest();
    void get();
    void post(RequestParams params);
}
