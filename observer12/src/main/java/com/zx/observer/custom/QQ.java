package com.zx.observer.custom;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/11/9.
 * //具体被观察者
 */

public class QQ implements IObservable {

    private List<IObserver> list = new ArrayList<IObserver>();//储存订阅者

    @Override
    public void sendMessage(String message) {
        for (IObserver observer : list) {
            observer.update(message);
        }
    }

    @Override
    public void addObserver(IObserver observer) {
        list.add(observer);
    }
}
