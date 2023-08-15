package com.bummon.command;

/**
 * @author Bummon
 * @description 具体命令者 博客地址：http://blog.bummon.com/blog/2014531079.html
 * @date 2023-08-15 11:29
 */
public class ConcreteCommand extends Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        super();
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
