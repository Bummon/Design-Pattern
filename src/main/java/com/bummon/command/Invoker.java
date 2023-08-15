package com.bummon.command;

/**
 * @author Bummon
 * @description 调用者 博客地址：http://blog.bummon.com/blog/2014531079.html
 * @date 2023-08-15 11:27
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }

}
