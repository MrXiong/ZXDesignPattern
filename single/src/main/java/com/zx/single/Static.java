package com.zx.single;

/**
 * Created by user on 2017/10/24.
 * 静态内部类单例模式
 * <p>
 * 这种是推荐使用的单例模式实现方式。当第一次加载Static类时并不会初始化INSTANCE，
 * 只有在第一次调用getInstance方法时才会导致INSTANCE被初始化。
 * 这种方式不仅能够保证线程安全，也能保证单例对象的唯一性，同时也延长了单例的实例化。
 */

public class Static {

    private Static() {
    }

    public static Static getInstance() {
        return StaticHolder.instance;
    }

    private static class StaticHolder {
        private static final Static instance = new Static();
    }
}
