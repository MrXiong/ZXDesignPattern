package com.zx.bridge;

/**
 * Created by user on 2017/11/14.
 */

public class LargeCoffee extends Coffee{

    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + impl.addSomething() + "咖啡");
    }

}