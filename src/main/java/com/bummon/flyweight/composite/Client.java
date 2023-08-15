package com.bummon.flyweight.composite;

import com.bummon.flyweight.composite.factory.FlyweightFactory;
import com.bummon.flyweight.composite.flyweight.Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Bummon
 * @description 复合享元模式 博客地址：http://blog.bummon.com/blog/3785206090.html
 * @date 2023-08-15 09:33
 */
public class Client {

    public static void main(String[] args) {
        List<String> compositeState = new ArrayList<String>();
        compositeState.add("张三");
        compositeState.add("李四");
        compositeState.add("王五");
        compositeState.add("李四");
        compositeState.add("张三");

        FlyweightFactory flyFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyFactory.factory(compositeState);
        Flyweight compositeFly2 = flyFactory.factory(compositeState);
        compositeFly1.operate("梦游中...");

        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2)); //false

        String user = "小A";
        Flyweight fly1 = flyFactory.factory(user);
        Flyweight fly2 = flyFactory.factory(user);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2)); //true
    }

}
