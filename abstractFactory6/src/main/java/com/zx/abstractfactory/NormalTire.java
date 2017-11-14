package com.zx.abstractfactory;

/**
 * Created by user on 2017/11/8.
 */

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
