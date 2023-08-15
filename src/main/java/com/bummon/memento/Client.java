package com.bummon.memento;

/**
 * @author Bummon
 * @description 备忘录模式 博客地址：http://blog.bummon.com/blog/3273090133.html
 * @date 2023-08-15 11:21
 */
public class Client {

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("付款");
        originator.setState("发货");
        Caretaker caretaker = new Caretaker();
        caretaker.addMemento(originator.saveToMemento());
        originator.setState("收货");
        System.out.println(originator);
        originator.restoreMemento(caretaker.getMemento());
        System.out.println(originator);
    }

}
