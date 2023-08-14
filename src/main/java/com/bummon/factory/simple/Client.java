package com.bummon.factory.simple;


import com.bummon.factory.simple.factory.SimpleFactory;
import com.bummon.factory.simple.product.Noodles;

/**
 * @author Bummon
 * @description 简单工厂模式 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 11:38
 */
public class Client {

    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        //制作拉面
        Noodles ramen = factory.cookNoodles("Ramen");
        ramen.cook();
        //制作汤面
        Noodles soupNoodles = factory.cookNoodles("SoupNoodles");
        soupNoodles.cook();
        //制作炒面
        Noodles stirFriedNoodles = factory.cookNoodles("StirFriedNoodles");
        stirFriedNoodles.cook();
    }

}
