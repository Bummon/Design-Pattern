package com.bummon.flyweight.simple.flyweight.impl;

import com.bummon.flyweight.simple.flyweight.Flyweight;

/**
 * @author Bummon
 * @description 具体享元角色 博客地址：http://blog.bummon.com/blog/3785206090.html
 * @date 2023-08-14 18:37
 */
public class CharacterFlyWeight implements Flyweight {
    /**
     * 内部状态是不变的，外部状态是变化的
     * 然后通过共享不变的部分，达到减少对象数量并节约内存的目的
     */
    private String name;

    /**
     * 外部状态（非享元）
     * @param name
     */
    public CharacterFlyWeight(String name) {
        this.name = name;
    }

    /**
     * 具体享元+非享元结合
     * @param type
     */
    @Override
    public void operate(String type) {
        System.out.println("姓名 = " + name);
        System.out.println("属性 = " + type);
    }
}
