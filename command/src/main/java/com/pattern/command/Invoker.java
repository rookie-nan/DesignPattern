package com.pattern.command;

public class Invoker {

    private Command mCommand;
    private final CustomCallBack mCustomCallBack;

    public Invoker(CustomCallBack callBack) {
        mCustomCallBack = callBack;
    }

    public void setCommand(Command command) {
        mCommand = command;
    }

    public void invoke() {
        mCommand.execute(mCustomCallBack);
    }
}
