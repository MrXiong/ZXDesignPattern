package com.zx.duty;

/**
 * Created by user on 2017/11/9.
 */

public class Director extends Leader{

    @Override
    public int limit() {
        return 5000;
    }

    @Override
    public void handle(int money) {
        System.out.println("主管批复报销"+ money +"元");
    }

    @Override
    public String getLeader() {
        return "当前是主管";
    }

}