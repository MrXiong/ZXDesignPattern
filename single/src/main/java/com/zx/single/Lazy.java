package com.zx.single;

/**
 * Created by user on 2017/10/24.
 * 懒汉式是判断，在用的时候才加载，会影响程序的速度。
 * 最关键的是，在并发的情况下，懒汉式是不安全的。
 * 如果两个线程，我们称它们为线程1和线程2，在同一时间调用getInstance()方法，
 * 如果线程1先进入if块，然后线程2进行控制，那么就会有两个实例被创建。(可以加同步synchronized解决线程安全问题)
 * <p>
 * <p>
 * 懒汉式顾名思义，会延迟加载，在第一次使用该单例的时候才会实例化对象出来，第一次调用时要做初始化，如果要做的工作比较多，性能上会有些延迟，之后就和饿汉式一样了。
 * 这种写法能够在多线程中很好的工作，但是每次调用getInstance方法都会进行同步，反应稍慢，还会造成不必要的开销，所以者这种不建议使用。
 */

public class Lazy {

    public static Lazy instance;

    private Lazy() {
    }

    public static synchronized Lazy getInstance() {
        if (null == instance) {
            instance = new Lazy();
        }
        return instance;
    }
}
