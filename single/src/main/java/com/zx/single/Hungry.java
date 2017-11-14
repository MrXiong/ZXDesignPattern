package com.zx.single;

/**
 * Created by user on 2017/10/24.
 * 饿汉式
 * 一直都是线程安全的
 * 饿汉式每次调用的时候不用做创建，直接返回已经创建好的实例。
 * 这样虽然节省了时间，但是却占用了空间，实例本身为static的，会一直在内存中带着
 * 如何选择：如果单件模式实例在系统中经常会被用到，饿汉式是一个不错的选择。
 * 反之如果单件模式在系统中会很少用到或者几乎不会用到，那么懒汉式是一个不错的选择。
 * <p>
 * http://blog.csdn.net/lingfeng928/article/details/52513954
 * 饿汉式在类创建的同时就实例化一个静态对象出来，不管之后会不会使用这个单例，都会占据一定的内存，但是相应的，在第一次调用时速度也会更快，因为其资源已经初始化完成，
 */

public class Hungry {

    private static Hungry instance = new Hungry();

    private Hungry() {
    }

    public Hungry getInstance() {
        return instance;
    }
}
