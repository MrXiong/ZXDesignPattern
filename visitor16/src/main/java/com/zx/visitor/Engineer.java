package com.zx.visitor;

import java.util.Random;

/**
 * Created by user on 2017/11/14.
 */

public class Engineer extends Staff {

    private int codeLines;//代码数量

    public Engineer(String name) {
        super(name);
        codeLines = new Random().nextInt(10 * 10000);
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }

    //攻城狮这一年写的代码数量
    public int getCodeLines(){
        return codeLines;
    }
}
