package com.zx.observer.system;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by user on 2017/11/9.
 * 码农，观察者
 */

public class Coder implements Observer {


    public String name;
    public Coder(String name) {
        this.name = name;
    }


    @Override
    public void update(Observable observable, Object o) {
        Log.v("tag", name+o);
    }
}
