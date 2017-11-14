package com.zx.observer.custom;

import android.util.Log;

/**
 * Created by user on 2017/11/9.
 * 具体观察者
 */

public class Person implements IObserver {

    public String name;
    public Person(String name) {
        this.name = name;
    }


    @Override
    public void update(String message) {
        Log.v("tag", name+message);
    }
}
