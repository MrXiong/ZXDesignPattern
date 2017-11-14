package com.zx.decorator;

/**
 * Created by user on 2017/11/14.
 */

public class HomeCloth extends AbsPersonCloth {

    public HomeCloth(AbsPerson mPerson) {
        super(mPerson);
    }

    /**
     * 穿短裤
     */
    private void dressShorts() {
        System.out.println("穿短裤");//在家里随便点
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShorts();
    }

}