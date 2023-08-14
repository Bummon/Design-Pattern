package com.bummon.factory.abstraction.factory.impl;

import com.bummon.factory.abstraction.factory.AbstractFactory;
import com.bummon.factory.abstraction.family.Food;
import com.bummon.factory.abstraction.family.product.impl.Chips;
import com.bummon.factory.abstraction.family.product.impl.Rice;

/**
 * @author Bummon
 * @description
 * @date 2023-08-14 14:54
 */
public class FoodFactoryA extends AbstractFactory {
    @Override
    public Food getStapleFood() {
        /**
         * 下单米饭
         */
        return new Rice();
    }

    @Override
    public Food getSnacksFood() {
        /**
         * 下单薯条
         */
        return new Chips();
    }
}
