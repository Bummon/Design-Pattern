package com.bummon.memento;

import lombok.Data;
import lombok.ToString;

/**
 * @author Bummon
 * @description 备忘录角色 博客地址：http://blog.bummon.com/blog/3273090133.html
 * @date 2023-08-15 11:14
 */
@Data
@ToString
public class Memento {

    private String state;

    public Memento(String state) {
        this.state = state;
    }

}
