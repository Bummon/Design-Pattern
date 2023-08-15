package com.bummon.observer;

/**
 * @author Bummon
 * @description 具体观察者角色 博客地址：http://blog.bummon.com/blog/2586075670.html
 * @date 2023-08-15 10:04
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void update() {
        System.out.println("观察者A收到目标角色改变事件");
    }
}
