package com.bummon.builder;

import com.bummon.builder.builder.concrete.CarBuilder;
import com.bummon.builder.product.concrete.Car;

/**
 * @author Bummon
 * @description 建造者模式 博客地址：https://blog.bummon.com/blog/4269894716.html
 * @date 2023-08-14 15:45
 */
public class Client {

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .engine("发动机1")
                .wheel("轮子1")
                .cylinder("气缸1")
                .color("黑色")
                .build();
        System.out.println(car);
    }

}
