package com.bummon.flyweight.simple.factory;

import com.bummon.flyweight.simple.flyweight.Flyweight;
import com.bummon.flyweight.simple.flyweight.impl.CharacterFlyWeight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Bummon
 * @description 享元工厂角色 博客地址：http://blog.bummon.com/blog/3785206090.html
 * @date 2023-08-14 18:38
 */
public class FlyweightFactory {

    //由工厂方法产生所需要的享元对象
    private Map<String, Flyweight> characterPool = new HashMap<>();

    public Flyweight factory(String user) {
        Flyweight flyweight = characterPool.get(user);
        if (Objects.isNull(flyweight)) {
            flyweight = new CharacterFlyWeight(user);
            characterPool.put(user, flyweight);
        }
        return flyweight;
    }

}
