package com.zx.decorator;

/**
 * Created by user on 2017/11/14.
 * 抽象装饰类（Decorator）
 */

public abstract class AbsPersonCloth extends AbsPerson {

    protected AbsPerson mPerson; //保持一个Person类的引用

    public AbsPersonCloth(AbsPerson person) {
        super();
        this.mPerson = person;
    }

    @Override
    public void dressed() {
        mPerson.dressed();
    }
}