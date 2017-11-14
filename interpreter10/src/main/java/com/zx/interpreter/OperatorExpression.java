package com.zx.interpreter;

/**
 * Created by user on 2017/11/9.
 */

public abstract class OperatorExpression extends ArithemticExpression{

    protected ArithemticExpression exp1, exp2;

    public OperatorExpression(ArithemticExpression exp1, ArithemticExpression exp2){
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

}
