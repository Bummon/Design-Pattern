package com.bummon.observer;

/**
 * @author Bummon
 * @description 具体目标角色 博客地址：http://blog.bummon.com/blog/2586075670.html
 * @date 2023-08-15 10:03
 */
public class ConcreteSubject extends Subject {
    @Override
    public void doSomething() {
        System.out.println("目标角色发生改变");
        this.notifyObserver();
    }
}
