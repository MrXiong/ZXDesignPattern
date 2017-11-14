package com.zx.memento.note;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by user on 2017/11/10.
 */

public class NoteEditText extends android.support.v7.widget.AppCompatEditText {
    public NoteEditText(Context context) {
        super(context);
    }

    public NoteEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NoteEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    //创建备忘录
    public NoteMemoto createMemoto() {
        NoteMemoto noteMemoto = new NoteMemoto();
        noteMemoto.setText(getText().toString());
        noteMemoto.setSelection(getSelectionStart());
        return noteMemoto;
    }

    //恢复编辑器状态
    public void restoreEditText(NoteMemoto noteMemoto) {
        setText(noteMemoto.getText());
        setSelection(noteMemoto.getSelection());
    }
}
