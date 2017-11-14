package com.zx.facade;

/**
 * Created by user on 2017/11/14.
 */

public class MobilePhone {
    private IPhone mPhone = new PhoneImpl();
    private ICamera mCamera = new SamsungCamera();

    public void dail(){
        mPhone.dail();
    }

    public void hangup() {
        mPhone.hangup();
    }

    public void takePicture() {
        mCamera.open();
        mCamera.takePicture();
    }

    public void closeCamera() {
        mCamera.close();
    }

    public void videoChat(){
        System.out.println("--> 视频聊天接通中");
        mCamera.open();
        mPhone.dail();
    }
}
