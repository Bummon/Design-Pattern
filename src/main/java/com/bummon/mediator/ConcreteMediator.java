package com.bummon.mediator;

/**
 * @author Bummon
 * @description 具体中介者 博客地址：http://blog.bummon.com/blog/3493201692.html
 * @date 2023-08-15 11:51
 */
public class ConcreteMediator extends Mediator {
    /**
     * 由具体同事A，向具体同事B发出指令
     */
    @Override
    public void transferA() {
        this.colleagueB.selfMethodB();
    }

    /**
     * 由具体同事B，向具体同事A发出指令
     */
    @Override
    public void transferB() {
        this.colleagueA.selfMethodA();
    }
}
