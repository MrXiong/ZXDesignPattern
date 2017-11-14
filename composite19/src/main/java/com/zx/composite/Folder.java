package com.zx.composite;

import java.util.Iterator;
import java.util.List;

/**
 * Created by user on 2017/11/14.
 * 表示文件夹的类：（Composite）
 */

public class Folder extends Dir{

    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        dirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        dirs.remove(dir);
    }

    @Override
    public void clear() {
        dirs.clear();
    }

    @Override
    public StringBuffer print() {
        StringBuffer str = new StringBuffer();
        str.append(getName() +"(");
        System.out.print(getName() + "(");
        Iterator<Dir> iter = dirs.iterator();
        while (iter.hasNext()) {
            Dir dir = iter.next();
            dir.print();
            str.append(dir.print());
            if(iter.hasNext()){
                str.append(",");
            }
        }
        str.append(")");
        return str;
    }

    @Override
    public List<Dir> getFiles() {
        return dirs;
    }

}