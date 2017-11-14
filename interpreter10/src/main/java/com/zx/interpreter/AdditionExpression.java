package com.zx.interpreter;

/**
 * Created by user on 2017/11/9.
 */

public class AdditionExpression extends OperatorExpression {

    public AdditionExpression(ArithemticExpression exp1,
                              ArithemticExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpreter() {
        return exp1.interpreter() + exp2.interpreter();
    }

}
