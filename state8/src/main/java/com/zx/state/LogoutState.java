package com.zx.state;

import android.content.Context;
import android.content.Intent;

/**
 * Created by user on 2017/11/9.
 */

public class LogoutState implements State {
    @Override
    public void forward(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
