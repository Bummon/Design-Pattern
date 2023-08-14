package com.bummon.factory.method.factory.concrete;


import com.bummon.factory.method.factory.MethodFactory;
import com.bummon.factory.method.product.Noodles;
import com.bummon.factory.method.product.concrete.SoupNoodles;

/**
 * @author Bummon
 * @description 具体工厂（Concrete Factory） 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 11:55
 */
public class RestaurantB extends MethodFactory {
    @Override
    public Noodles getNoodles() {
        return new SoupNoodles();
    }
}
