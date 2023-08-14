package com.bummon.factory.simple.product.concrete;


import com.bummon.factory.simple.product.Noodles;

/**
 * @author Bummon
 * @description 具体产品（Concrete Product） 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 11:35
 */
public class StirFriedNoodles implements Noodles {
    @Override
    public void cook() {
        System.out.println("正在制作炒面...");
    }
}
