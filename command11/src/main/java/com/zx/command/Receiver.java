package com.zx.command;

import android.util.Log;

/**
 * Created by user on 2017/11/9.
 */

//接收者，处理具体逻辑
public class Receiver {

    public void toLeft(){
        Log.v("tag", "向左=====");

    }
    public void toRight(){
        Log.v("tag", "向右=====");
    }

    //增加功能，只需要再新增一个命令就好了
    public void shutdown(){
        Log.v("tag", "关闭====");
    }
}
