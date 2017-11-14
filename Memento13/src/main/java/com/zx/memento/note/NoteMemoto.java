package com.zx.memento.note;

/**
 * Created by user on 2017/11/9.
 */

public class NoteMemoto {

    private String Text;
    private int selection;

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getSelection() {
        return selection;
    }

    public void setSelection(int selection) {
        this.selection = selection;
    }
}
