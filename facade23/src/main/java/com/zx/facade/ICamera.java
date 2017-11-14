package com.zx.facade;

/**
 * Created by user on 2017/11/14.
 */

public interface ICamera {
    //打开相机
    public void open();

    //拍照
    public void takePicture();

    //关闭相机
    public void close();
}
