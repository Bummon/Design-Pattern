package com.bummon.command;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 11:31
 */
public class ConcreteReceiverA extends Receiver {
    @Override
    public void action() {
        System.out.println("接收者A收到命令");
    }
}
