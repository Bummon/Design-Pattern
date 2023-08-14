package com.bummon.bridge.abstraction;

import com.bummon.bridge.implementor.DrawApi;

/**
 * @author Bummon
 * @description 抽象化角色 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-14 17:48
 */
public abstract class Shape {
    /**
     * 受保护类型的DrawApi，用于调用具体的绘制方法
     */

    protected DrawApi drawApi;

    public Shape(DrawApi drawApi) {
        this.drawApi = drawApi;
    }

    /**
     * 抽象绘制方法，具体绘制由其子类实现
     */
    public abstract void draw();

}
