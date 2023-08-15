package com.bummon.command;

/**
 * @author Bummon
 * @description 命令模式 博客地址：http://blog.bummon.com/blog/2014531079.html
 * @date 2023-08-15 11:32
 */
public class Client {

    public static void main(String[] args) {
        Receiver receiverA = new ConcreteReceiverA();
        Command command1 = new ConcreteCommand(receiverA);

        Invoker invoker = new Invoker();
        invoker.setCommand(command1);
        invoker.call();

        Receiver receiverB = new ConcreteReceiverB();
        Command command2 = new ConcreteCommand(receiverB);

        invoker.setCommand(command2);
        invoker.call();
    }

}
