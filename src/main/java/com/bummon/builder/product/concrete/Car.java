package com.bummon.builder.product.concrete;

import lombok.Data;
import lombok.ToString;

/**
 * @author Bummon
 * @description 具体产品（Concrete Product） 博客地址：https://blog.bummon.com/blog/4269894716.html
 * @date 2023-08-14 15:42
 */
@Data
@ToString
public class Car {

    /**
     * 发动机
     */
    private String engine;

    /**
     * 轮子
     */
    private String wheel;

    /**
     * 气缸
     */
    private String cylinder;

    /**
     * 车的颜色
     */
    private String color;

}
