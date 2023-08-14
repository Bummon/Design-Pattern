package com.bummon.prototype.simple;

import com.bummon.prototype.simple.prototype.Prototype;
import com.bummon.prototype.simple.prototype.concrete.ConcretePrototypeA;
import com.bummon.prototype.simple.prototype.concrete.ConcretePrototypeB;

/**
 * @author Bummon
 * @description
 * @date 2023-08-14 15:55
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("prototypeA");
        ConcretePrototypeA prototypeA = new ConcretePrototypeA("prototypeB");
        Prototype cloneA = prototypeA.clone();
        System.out.println("prototypeA:" + prototypeA);
        System.out.println("clone:" + cloneA);
        System.out.println("prototypeB");
        ConcretePrototypeB prototypeB = new ConcretePrototypeB("prototypeB");
        Prototype cloneB = prototypeB.clone();
        System.out.println("prototypeB:" + prototypeB);
        System.out.println("clone:" + cloneB);
    }

}
