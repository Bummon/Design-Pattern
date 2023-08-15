package com.bummon.flyweight.composite.factory;

import com.bummon.flyweight.composite.flyweight.impl.CharacterCompositeFlyweight;
import com.bummon.flyweight.composite.flyweight.impl.CharacterFlyweight;
import com.bummon.flyweight.composite.flyweight.Flyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Bummon
 * @description 享元工厂角色 博客地址：http://blog.bummon.com/blog/3785206090.html
 * @date 2023-08-15 09:31
 */
public class FlyweightFactory {

    private Map<String, Flyweight> characterPool = new HashMap<>();

    /**
     * 复合工厂方法
     * 一种用于提供单纯享元对象，另一种提供复合享元对象
     */
    public Flyweight factory(List<String> compositeState) {
        CharacterCompositeFlyweight compositeFlyweight = new CharacterCompositeFlyweight();
        compositeState.forEach(any -> compositeFlyweight.add(any, this.factory(any)));
        return compositeFlyweight;
    }

    /**
     * 单纯工厂方法
     * 提供所需要的享元对象
     */
    public Flyweight factory(String user) {
        // 先从缓存中查找对象
        Flyweight flyweight = characterPool.get(user);
        if (null == flyweight) {
            // 如果对象不存在则创建一个新对象
            flyweight = new CharacterFlyweight(user);
            // 将新对象添加到缓存中
            characterPool.put(user, flyweight);
        }
        return flyweight;
    }

}
