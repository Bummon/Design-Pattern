package com.bummon.factory.abstraction.factory.concrete;

import com.bummon.factory.abstraction.factory.AbstractFactory;
import com.bummon.factory.abstraction.family.Food;
import com.bummon.factory.abstraction.family.product.concrete.Chips;
import com.bummon.factory.abstraction.family.product.concrete.Hamburger;
import com.bummon.factory.abstraction.family.product.concrete.Noodles;
import com.bummon.factory.abstraction.family.product.concrete.Rice;

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
