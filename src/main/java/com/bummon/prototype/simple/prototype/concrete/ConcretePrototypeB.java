package com.bummon.prototype.simple.prototype.concrete;

import com.bummon.prototype.simple.prototype.Prototype;

/**
 * @author Bummon
 * @description 具体原型（Concrete Prototype） 博客地址：http://blog.bummon.com/blog/2444074211.html
 * @date 2023-08-14 15:53
 */
public class ConcretePrototypeB extends Prototype {

    public ConcretePrototypeB(String name) {
        super(name);
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(this.getName());
    }
}
