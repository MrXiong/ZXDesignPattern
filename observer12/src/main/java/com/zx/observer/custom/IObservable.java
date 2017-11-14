package com.zx.observer.custom;

/**
 * Created by user on 2017/11/9.
 * 抽象被观察者
 */

public interface IObservable {
    //发消息
    void sendMessage(String message);
    //订阅
    void addObserver(IObserver observer);
}
