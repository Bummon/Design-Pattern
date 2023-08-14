package com.bummon.composite.transparent;

import java.util.List;

/**
 * @author Bummon
 * @description 抽象构件 博客地址：http://blog.bummon.com/blog/3750205330.html
 * @date 2023-08-14 18:09
 */
public abstract class Component {

    public void operation() {
        //业务逻辑
        System.out.println("operation被执行了");
    }

    /**
     * 增加一个叶子构件或树枝构件
     */
    public abstract void add(Component component);

    /**
     * 删除一个叶子构件或树枝构件
     */

    public abstract void remove(Component component);

    /**
     * 获取当前分支下的所有叶子构件和树枝构件
     */
    public abstract List<Component> getChildren();

}
