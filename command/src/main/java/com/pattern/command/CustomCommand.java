package com.pattern.command;

public class CustomCommand extends Command{

    private Receiver mReceiver;

    public CustomCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    void execute(CustomCallBack callBack) {
        mReceiver.customPrint(callBack);
    }
}
