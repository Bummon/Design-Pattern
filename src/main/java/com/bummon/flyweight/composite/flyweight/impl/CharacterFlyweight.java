package com.bummon.flyweight.composite.flyweight.impl;

import com.bummon.flyweight.composite.flyweight.Flyweight;

/**
 * @author Bummon
 * @description 具体享元角色 博客地址：http://blog.bummon.com/blog/3785206090.html
 * @date 2023-08-15 09:24
 */
public class CharacterFlyweight implements Flyweight {
    /**
     * 内部状态是不变的，外部状态变化
     * 通过共享不变的部分，达到减少对象数量并节约内存的目的
     */
    private String name;

    public CharacterFlyweight(String name) {
        this.name = name;
    }

    @Override
    public void operate(String type) {
        System.out.println("姓名：" + name);
        System.out.println("属性：" + type);
    }
}
