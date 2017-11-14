package com.zx.state;

import android.content.Context;

/**
 * Created by user on 2017/11/9.
 */

public class LoginTools {
    public static LoginTools instance;

    public static LoginTools getInstance() {
        if(null == instance) {
            synchronized (LoginTools.class) {
                if(null == instance) {
                    instance = new LoginTools();
                }
            }
        }
        return instance;
    }

    //默认是未登录状态
    private State mState = new LogoutState();


    public void setState(State state){
        this.mState = state;
    }

    public void forward(Context context){
        mState.forward(context);
    }
}
