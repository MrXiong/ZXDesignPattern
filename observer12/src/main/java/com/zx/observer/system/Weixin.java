package com.zx.observer.system;

import java.util.Observable;

/**
 * Created by user on 2017/11/9.
 * 被观察者
 */

public class Weixin extends Observable {

    //发布更新消息
    public void sendMessages(String msg) {
        setChanged();
        notifyObservers(msg);
    }
}
