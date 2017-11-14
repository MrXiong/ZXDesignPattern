package com.zx.memento;

/**
 * Created by user on 2017/11/9.
 * 备忘录
 */

public class Memoto {
    public int mCheckpoint;//武器

    public int mLiftValue;//生命

    public String mWeapon;//关卡

    @Override
    public String toString() {
        return "Memento [mCheckpoint=" + mCheckpoint + ",mLiftValue="
                + mLiftValue + ",mWeapon=" + mWeapon + "]";
    }
}
