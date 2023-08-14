package com.bummon.bridge.abstraction.impl;

import com.bummon.bridge.implementor.DrawApi;
import com.bummon.bridge.abstraction.Shape;

/**
 * @author Bummon
 * @description 扩展抽象化角色 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-14 17:51
 */
public class Circle extends Shape {
    public Circle(DrawApi drawApi) {
        super(drawApi);
    }

    @Override
    public void draw() {
        drawApi.draw("圆形");
    }
}
