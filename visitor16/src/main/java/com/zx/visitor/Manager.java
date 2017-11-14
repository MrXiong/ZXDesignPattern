package com.zx.visitor;

import java.util.Random;

/**
 * Created by user on 2017/11/14.
 */

public class Manager extends Staff {
    private int products;//产品数量

    public Manager(String name) {
        super(name);
        products = new Random().nextInt(10);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //一年内做的产品数量
    public int getProducts() {
        return products;
    }
}
