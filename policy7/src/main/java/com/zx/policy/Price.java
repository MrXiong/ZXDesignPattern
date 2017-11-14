package com.zx.policy;

/**
 * Created by user on 2017/11/9.
 */

public class Price {

    private Policy policy;

    public Price(Policy policy){
       this.policy = policy;
    }

    public double count(double price){
        return policy.calcPrice(price);
    }
}
