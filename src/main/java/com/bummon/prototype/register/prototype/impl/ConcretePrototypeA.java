package com.bummon.prototype.register.prototype.impl;

import com.bummon.prototype.register.prototype.Prototype;

/**
 * @author Bummon
 * @description 具体原型 博客地址：http://blog.bummon.com/blog/2444074211.html
 * @date 2023-08-14 16:03
 */
public class ConcretePrototypeA implements Prototype {

    private String name;

    @Override
    public Prototype clone() {
        ConcretePrototypeA prototypeA = new ConcretePrototypeA();
        prototypeA.setName(this.name);
        return prototypeA;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
