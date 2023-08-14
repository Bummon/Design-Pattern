package com.bummon.factory.abstraction.factory.impl;

import com.bummon.factory.abstraction.factory.AbstractFactory;
import com.bummon.factory.abstraction.family.Food;
import com.bummon.factory.abstraction.family.product.impl.Hamburger;
import com.bummon.factory.abstraction.family.product.impl.Noodles;

/**
 * @author Bummon
 * @description
 * @date 2023-08-14 14:54
 */
public class FoodFactoryB extends AbstractFactory {
    @Override
    public Food getStapleFood() {
        /**
         * 下单面条
         */
        return new Noodles();
    }

    @Override
    public Food getSnacksFood() {
        /**
         * 下单汉堡
         */
        return new Hamburger();
    }
}
