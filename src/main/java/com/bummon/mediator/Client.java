package com.bummon.mediator;

/**
 * @author Bummon
 * @description 中介者模式 博客地址：http://blog.bummon.com/blog/3493201692.html
 * @date 2023-08-15 11:56
 */
public class Client {

    public static void main(String[] args) {
        // 创建抽象中介者
        Mediator mediator = new ConcreteMediator();
        // 具体同事类
        ConcreteColleagueA colleagueA = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleagueB = new ConcreteColleagueB(mediator);
        // 中介者进行转发协作,A转发给B
        colleagueA.depMethodA();
        System.out.println("-------------------------");
        // 中介者进行转发协作,B转发给A
        colleagueB.depMethodB();
    }

}
