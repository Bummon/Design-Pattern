package com.bummon.factory.method;


import com.bummon.factory.method.factory.concrete.RestaurantA;
import com.bummon.factory.method.factory.concrete.RestaurantB;
import com.bummon.factory.method.factory.concrete.RestaurantC;

/**
 * @author Bummon
 * @description 工厂方法模式 博客地址：https://blog.bummon.com/blog/1417187187.html
 * @date 2023-08-14 11:56
 */
public class Client {

    public static void main(String[] args) {
        //拉面
        RestaurantA restaurantA = new RestaurantA();
        restaurantA.getNoodles().eat();
        //汤面
        RestaurantB restaurantB = new RestaurantB();
        restaurantB.getNoodles().eat();
        //炒面
        RestaurantC restaurantC = new RestaurantC();
        restaurantC.getNoodles().eat();
    }

}
