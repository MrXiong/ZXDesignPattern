package com.zx.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by user on 2017/11/14.
 * 创建一个代理类
 */

public class DynamicPorxy implements InvocationHandler {

    private Object obj; //被代理类的引用

    public DynamicPorxy(Object obj) {
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        // 调用被代理类对象的方法
        Object result = method.invoke(obj, args);
        return result;
    }

}
