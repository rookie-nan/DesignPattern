package com.pattern.command;

public class Receiver {
    public void customPrint(CustomCallBack callBack) {
        //执行具体的打印操作
        callBack.printSomeThing();
    }
}
