package com.bummon.memento;

import java.util.Stack;

/**
 * @author Bummon
 * @description 负责人角色 博客地址：http://blog.bummon.com/blog/3273090133.html
 * @date 2023-08-15 11:14
 */
public class Caretaker {

    private final Stack<Memento> stack = new Stack<>();

    public void addMemento(Memento memento) {
        stack.push(memento);
    }

    public Memento getMemento() {
        return stack.pop();
    }

}
