package com.zx.command;

/**
 * Created by user on 2017/11/9.
 */

public class RightCommand implements Command {

    private Receiver receiver;

    public RightCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.toRight();
    }
}
