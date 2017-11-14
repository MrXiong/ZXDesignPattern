package com.zx.visitor;

/**
 * Created by user on 2017/11/14.
 */

public class CEOVisitor implements  IVisitor{
    @Override
    public void visit(Engineer engineer) {
        System.out.println("攻城狮：" + engineer.name + ", KPI:" + engineer.kpi);
    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.name + ", KPI:" + manager.kpi
                + ", 新产品数量 ：" + manager.getProducts());
    }
}
