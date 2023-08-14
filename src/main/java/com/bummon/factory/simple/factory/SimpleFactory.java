package com.bummon.factory.simple.factory;


import com.bummon.factory.simple.product.Noodles;
import com.bummon.factory.simple.product.concrete.Ramen;
import com.bummon.factory.simple.product.concrete.SoupNoodles;
import com.bummon.factory.simple.product.concrete.StirFriedNoodles;

/**
 * @author Bummon
 * @description 具体工厂（Factory） 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 11:36
 */
public class SimpleFactory {

    public Noodles cookNoodles(String type) {
        switch (type) {
            case "Ramen":
                return new Ramen();
            case "SoupNoodles":
                return new SoupNoodles();
            case "StirFriedNoodles":
                return new StirFriedNoodles();
            default:
                return null;
        }
    }

}
