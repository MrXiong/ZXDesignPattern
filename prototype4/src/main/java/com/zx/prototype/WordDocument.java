package com.zx.prototype;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/11/8.
 */

public class WordDocument implements Cloneable {

    private static final String TAG = WordDocument.class.getSimpleName();
    private String text;
    private ArrayList<String> imgs = new ArrayList<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getImgs() {
        return imgs;
    }

    public void setImgs(ArrayList<String> imgs) {
        this.imgs = imgs;
    }

    public void addImg(String img) {
        imgs.add(img);
    }

    public WordDocument() {
        Log.v(TAG, "构造函数。。。");
    }


    //浅拷贝，不会执行构造函数，拷贝后和前指向同一个地址
/*    @Override
    protected WordDocument clone() throws CloneNotSupportedException {
        WordDocument doc = (WordDocument) super.clone();
        doc.text = this.text;
        doc.imgs = this.imgs;
        return doc;
    }*/
    //深拷贝，不会执行构造函数，拷贝后和前不是同一个地址
    @Override
    protected WordDocument clone() {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.text = this.text;
            doc.imgs = (ArrayList<String>) this.imgs.clone();
            return doc;
        } catch (Exception e) {

        }

        return null;
    }

    public void show(String state) {
        Log.v(TAG, "=================" + state);
        Log.v(TAG, text);
        for (String str : imgs) {
            Log.v(TAG, "img==" + str);
        }


    }
}
