package com.zx.abstractfactory;

/**
 * Created by user on 2017/11/8.
 */

public class SUVTire implements ITire {
    @Override
    public void tire() {
        System.out.println("越野轮胎");
    }
}
