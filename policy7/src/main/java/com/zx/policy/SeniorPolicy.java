package com.zx.policy;

/**
 * Created by user on 2017/11/9.
 */

public class SeniorPolicy implements Policy {
    /**
     * 高级会员折扣
     */
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
