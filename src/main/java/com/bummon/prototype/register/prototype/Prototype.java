package com.bummon.prototype.register.prototype;

/**
 * @author Bummon
 * @description 抽象原型 博客地址：http://blog.bummon.com/blog/2444074211.html
 * @date 2023-08-14 15:59
 */
public interface Prototype {

    public Prototype clone();

    public String getName();

    public void setName(String name);

}
