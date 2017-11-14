package com.zx.bridge;

/**
 * Created by user on 2017/11/14.
 */

public class SmallCoffee extends Coffee{

    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的" + impl.addSomething() + "咖啡");
    }
}
