package com.zx.command;

import android.util.Log;

/**
 * Created by user on 2017/11/9.
 */

public class ShutdownCommand implements Command {
    @Override
    public void execute() {
        Log.v("tag", "关闭计算机");
    }
}
