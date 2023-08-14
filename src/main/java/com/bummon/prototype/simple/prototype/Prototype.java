package com.bummon.prototype.simple.prototype;

/**
 * @author Bummon
 * @description 抽象原型 博客地址：http://blog.bummon.com/blog/2444074211.html
 * @date 2023-08-14 15:50
 */
public abstract class Prototype {

    private String name;

    public Prototype(String name) {
        this.name = name;
    }

    /**
     * 克隆方法
     */
    public abstract Prototype clone();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
