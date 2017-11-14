package com.zx.state;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by user on 2017/11/9.
 */

public class LoginState implements State {
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发", Toast.LENGTH_SHORT).show();
    }
}
