package com.zx.composite;

import java.util.List;

/**
 * Created by user on 2017/11/14.
 */

public class File extends Dir{

    public File(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作！");
    }

    @Override
    public void rmDir(Dir dir) {
        throw new UnsupportedOperationException("文件对象不支持该操作！");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("文件对象不支持该操作！");
    }

    @Override
    public StringBuffer print() {
        return  new StringBuffer(getName());
    }

    @Override
    public List<Dir> getFiles() {
        throw new UnsupportedOperationException("文件对象不支持该操作！");
    }

}