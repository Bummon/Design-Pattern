package com.bummon.bridge.implementor.impl;

import com.bummon.bridge.implementor.DrawApi;

/**
 * @author Bummon
 * @description 具体实现化角色 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-14 17:47
 */
public class PaperDrawApi implements DrawApi {
    @Override
    public void draw(String shape) {
        System.out.println("在纸上绘制" + shape);
    }
}
