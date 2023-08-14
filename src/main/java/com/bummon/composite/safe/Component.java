package com.bummon.composite.safe;

/**
 * @author Bummon
 * @description 抽象构件 博客地址：http://blog.bummon.com/blog/3750205330.html
 * @date 2023-08-14 18:20
 */
public abstract class Component {

    public void operation() {
        //业务逻辑
        System.out.println("Component: operation被执行了");
    }

}
