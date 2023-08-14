package com.bummon.factory.abstraction;

import com.bummon.factory.abstraction.factory.concrete.FoodFactoryA;
import com.bummon.factory.abstraction.factory.concrete.FoodFactoryB;

/**
 * @author Bummon
 * @description 抽象工厂模式 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 14:57
 */
public class Client {

    public static void main(String[] args) {
        FoodFactoryA factoryA = new FoodFactoryA();
        factoryA.getStapleFood().description();
        factoryA.getSnacksFood().description();

        FoodFactoryB factoryB = new FoodFactoryB();
        factoryB.getStapleFood().description();
        factoryB.getSnacksFood().description();
    }

}
