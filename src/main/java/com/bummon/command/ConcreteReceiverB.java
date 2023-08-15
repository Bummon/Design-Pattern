package com.bummon.command;

/**
 * @author Bummon
 * @description
 * @date 2023-08-15 11:31
 */
public class ConcreteReceiverB extends Receiver {
    @Override
    public void action() {
        System.out.println("接收者B收到命令");
    }
}
