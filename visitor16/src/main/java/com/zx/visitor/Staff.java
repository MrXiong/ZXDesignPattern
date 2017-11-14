package com.zx.visitor;

import java.util.Random;

/**
 * Created by user on 2017/11/14.
 */

public abstract class Staff {
    //员工姓名
    public String name;
    //员工KPI
    public int kpi;

    public Staff(String name) {
        super();
        this.name = name;
        this.kpi = new Random().nextInt(10);
    }

    //接受Visitor的访问
    public abstract void accept(IVisitor visitor);

}
