package com.zx.visitor;

/**
 * Created by user on 2017/11/14.
 */

public interface IVisitor {
    /**
     * 访问攻城狮类型
     */
    void visit(Engineer engineer);

    /**
     * 访问经理类型
     */
    void visit(Manager manager);
}
