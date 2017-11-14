package com.zx.facade;

/**
 * Created by user on 2017/11/14.
 */

public class SamsungCamera implements ICamera {

    @Override
    public void open() {
        System.out.println("打开相机");
    }

    @Override
    public void takePicture() {
        System.out.println("拍照");
    }

    @Override
    public void close() {
        System.out.println("关闭相机");
    }

}