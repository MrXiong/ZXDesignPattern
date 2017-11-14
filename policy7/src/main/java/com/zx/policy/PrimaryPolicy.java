package com.zx.policy;

/**
 * Created by user on 2017/11/9.
 */

public class PrimaryPolicy implements Policy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }
}
