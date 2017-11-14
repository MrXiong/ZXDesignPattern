package com.zx.factory;

/**
 * Created by user on 2017/11/8.
 */

public abstract class Factory {

    public abstract <T extends Product> T createProduct(Class<T> clz);
}
