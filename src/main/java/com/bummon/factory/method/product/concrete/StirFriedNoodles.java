package com.bummon.factory.method.product.concrete;


import com.bummon.factory.method.product.Noodles;

/**
 * @author Bummon
 * @description 具体产品（Concrete Product） 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 11:51
 */
public class StirFriedNoodles extends Noodles {
    @Override
    public void eat() {
        System.out.println("我要吃炒面...");
    }
}
