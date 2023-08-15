package com.bummon.observer;

import java.util.Vector;

/**
 * @author Bummon
 * @description 目标角色  博客地址：http://blog.bummon.com/blog/2586075670.html
 * @date 2023-08-15 10:00
 */
public abstract class Subject {

    private Vector<Observer> obs = new Vector<>();

    /**
     * 添加观察者
     */
    public void add(Observer observer) {
        obs.add(observer);
    }

    /**
     * 移除观察者
     */
    public void remove(Observer observer) {
        obs.remove(observer);
    }

    /**
     * 通知观察者
     */
    protected void notifyObserver() {
        obs.forEach(any -> any.update());
    }

    /**
     * 其他业务
     */
    public abstract void doSomething();

}
