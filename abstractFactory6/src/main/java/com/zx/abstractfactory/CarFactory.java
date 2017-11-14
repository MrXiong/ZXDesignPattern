package com.zx.abstractfactory;

/**
 * Created by user on 2017/11/8.
 */

public abstract class CarFactory {
    /**
     * 生产轮胎
     *
     * @return 轮胎
     * */
    public abstract ITire createTire();

    /**
     * 生产发动机
     *
     * @return 发动机
     * */
    public abstract IEngine createEngine();
}
