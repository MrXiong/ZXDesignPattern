package com.zx.facade;

/**
 * Created by user on 2017/11/14.
 */

public class PhoneImpl implements IPhone {
    @Override
    public void dail() {
        System.out.println("打电话");
    }

    @Override
    public void hangup() {
        System.out.println("挂断");
    }

}
