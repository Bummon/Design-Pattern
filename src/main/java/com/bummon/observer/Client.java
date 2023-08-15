package com.bummon.observer;

/**
 * @author Bummon
 * @description 观察者模式 博客地址：http://blog.bummon.com/blog/2586075670.html
 * @date 2023-08-15 10:04
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.add(new ConcreteObserverA());
        subject.add(new ConcreteObserverB());
        subject.doSomething();
    }

}
