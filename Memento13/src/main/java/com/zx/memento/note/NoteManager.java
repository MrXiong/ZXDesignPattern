package com.zx.memento.note;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 2017/11/10.
 */

public class NoteManager {

    private int MAX = 30;
    private List<NoteMemoto> mMemotos = new ArrayList<>(MAX);
    private int mIndex;


    public void saveMemoto(NoteMemoto noteMemoto) {
        if (mMemotos.size() > MAX) {
            mMemotos.remove(0);
        }
        mMemotos.add(noteMemoto);
        mIndex = mMemotos.size() - 1;

    }

    //获取上一个存档
    public NoteMemoto getPrevMemoto() {
        mIndex = mIndex > 0 ? --mIndex : mIndex;
        return mMemotos.get(mIndex);
    }

    //获取下一个存档
    public NoteMemoto getNextMemoto() {
        mIndex = mIndex < mMemotos.size() - 1 ? ++mIndex : mIndex;
        return mMemotos.get(mIndex);
    }

}
