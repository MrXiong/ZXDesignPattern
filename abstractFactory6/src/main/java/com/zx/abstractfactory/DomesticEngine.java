package com.zx.abstractfactory;

/**
 * Created by user on 2017/11/8.
 */

public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("国产发动机");
    }
}
