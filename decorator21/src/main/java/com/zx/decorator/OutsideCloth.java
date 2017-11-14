package com.zx.decorator;

/**
 * Created by user on 2017/11/14.
 * 出门穿的衣服：
 */

public class OutsideCloth extends AbsPersonCloth {
    public OutsideCloth(AbsPerson mPerson) {
        super(mPerson);
    }

    /**
     * 穿短袖
     */
    private void dressShirt() {
        System.out.println("高档短袖");
    }

    /**
     * 穿牛仔裤
     */
    private void dressJean() {
        System.out.println("高档牛仔裤");
    }

    /**
     * 穿鞋子
     */
    private void dressShoes() {
        System.out.println("高档鞋子 ");
    }

    @Override
    public void dressed() {
        super.dressed();
        dressShirt();
        dressJean();
        dressShoes();
    }

}
