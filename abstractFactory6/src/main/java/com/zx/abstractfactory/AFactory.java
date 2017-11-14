package com.zx.abstractfactory;

/**
 * Created by user on 2017/11/8.
 */

public class AFactory extends CarFactory {
    @Override
    public ITire createTire() {
        return null;
    }

    @Override
    public IEngine createEngine() {
        return null;
    }
}
