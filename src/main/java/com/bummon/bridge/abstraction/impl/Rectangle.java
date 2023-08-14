package com.bummon.bridge.abstraction.impl;

import com.bummon.bridge.abstraction.Shape;
import com.bummon.bridge.implementor.DrawApi;

/**
 * @author Bummon
 * @description 扩展抽象化角色 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-14 17:51
 */
public class Rectangle extends Shape {
    public Rectangle(DrawApi drawApi) {
        super(drawApi);
    }

    @Override
    public void draw() {
        drawApi.draw("矩形");
    }
}
