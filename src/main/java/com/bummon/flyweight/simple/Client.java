package com.bummon.flyweight.simple;

import com.bummon.flyweight.simple.factory.FlyweightFactory;
import com.bummon.flyweight.simple.flyweight.Flyweight;

import java.util.Objects;

/**
 * @author Bummon
 * @description 单纯享元模式 博客地址：http://blog.bummon.com/blog/3785206090.html
 * @date 2023-08-15 09:20
 */
public class Client {

    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight zhangsan1 = factory.factory("张三");
        zhangsan1.operate("内向");
        Flyweight lisi = factory.factory("李四");
        lisi.operate("自信");
        Flyweight zhangsan2 = factory.factory("张三");
        zhangsan2.operate("阳光");

        System.out.println(Objects.equals(zhangsan1, zhangsan2));
    }

}
