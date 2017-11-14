package com.zx.adapter;

/**
 * Created by user on 2017/11/14.
 */

public class VoltAdapter extends Volt220 implements FiveVolt{

    @Override
    public int getVolt5() {
        return 5;
    }

}