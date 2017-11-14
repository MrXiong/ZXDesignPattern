package com.zx.bridge;

/**
 * Created by user on 2017/11/14.
 * 咖啡类：（Abstraction）
 */

public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡具体什么样由子类决定
     */
    public abstract void makeCoffee();

}
