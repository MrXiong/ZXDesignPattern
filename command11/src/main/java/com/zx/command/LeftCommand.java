package com.zx.command;

/**
 * Created by user on 2017/11/9.
 */

public class LeftCommand implements Command {

    private Receiver receiver;
    public LeftCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    @Override
    public void execute() {
        receiver.toLeft();
    }
}
