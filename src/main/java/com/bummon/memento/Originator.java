package com.bummon.memento;

import lombok.Data;
import lombok.ToString;

/**
 * @author Bummon
 * @description 原发器角色 博客地址：http://blog.bummon.com/blog/3273090133.html
 * @date 2023-08-15 11:12
 */
@Data
@ToString
public class Originator {

    private String state;

    public Memento saveToMemento(){
        return new Memento(state);
    }

    public void restoreMemento(Memento memento){
        this.state = memento.getState();
    }

}
