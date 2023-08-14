package com.bummon.factory.abstraction.factory;

import com.bummon.factory.abstraction.family.Food;

/**
 * @author Bummon
 * @description 抽象工厂 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 14:52
 */
public abstract class AbstractFactory {

    public abstract Food getStapleFood();

    public abstract Food getSnacksFood();

}
