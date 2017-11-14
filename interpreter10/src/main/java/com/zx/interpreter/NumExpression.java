package com.zx.interpreter;

/**
 * Created by user on 2017/11/9.
 */

public class NumExpression extends ArithemticExpression{

    private int num;

    public NumExpression(int num){
        this.num = num;
    }

    @Override
    public int interpreter() {
        return num;
    }
}