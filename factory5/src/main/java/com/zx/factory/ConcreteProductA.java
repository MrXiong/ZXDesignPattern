package com.zx.factory;

import android.util.Log;

/**
 * Created by user on 2017/11/8.
 */

public class ConcreteProductA extends Product{
    @Override
    public void create() {
        Log.v("tag", "创建产品A");
    }
}
