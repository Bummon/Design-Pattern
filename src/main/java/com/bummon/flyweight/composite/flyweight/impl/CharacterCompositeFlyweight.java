package com.bummon.flyweight.composite.flyweight.impl;

import com.bummon.flyweight.composite.flyweight.Flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Bummon
 * @description 复合享元角色 博客地址：http://blog.bummon.com/blog/3785206090.html
 * @date 2023-08-15 09:26
 */
public class CharacterCompositeFlyweight implements Flyweight {

    private Map<String, Flyweight> files = new HashMap<>();

    public void add(String key, Flyweight flyweight) {
        files.put(key, flyweight);
    }

    @Override
    public void operate(String type) {
        Flyweight flyweight;
        for (String key : files.keySet()) {
            flyweight = files.get(key);
            flyweight.operate(type);
        }

    }
}
