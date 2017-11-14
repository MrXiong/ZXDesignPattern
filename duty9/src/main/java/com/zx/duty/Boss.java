package com.zx.duty;

/**
 * Created by user on 2017/11/9.
 */

public class Boss extends Leader{

    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("老板批复报销"+ money +"元");
    }

    @Override
    public String getLeader() {
        return "当前是老板";
    }

}
