package com.bummon.decorator;

/**
 * @author Bummon
 * @description 抽象装饰器 博客地址：http://blog.bummon.com/blog/2614702854.html
 * @date 2023-08-14 17:01
 */
public interface Decorator extends SSO {

    /**
     * 定义一个限制权限的方法
     */
    boolean limit();

}
