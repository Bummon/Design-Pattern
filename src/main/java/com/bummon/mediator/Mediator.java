package com.bummon.mediator;

/**
 * @author Bummon
 * @description 抽象中介者 博客地址：http://blog.bummon.com/blog/3493201692.html
 * @date 2023-08-15 11:50
 */
public abstract class Mediator {

    protected ConcreteColleagueA colleagueA;
    protected ConcreteColleagueB colleagueB;

    public void setColleagueA(ConcreteColleagueA colleague) {
        this.colleagueA = colleague;
    }

    public void setColleagueB(ConcreteColleagueB colleague) {
        this.colleagueB = colleague;
    }

    public abstract void transferA();

    public abstract void transferB();

}
