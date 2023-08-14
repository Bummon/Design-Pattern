package com.bummon.adapter.simple;

import com.bummon.adapter.object.Adaptee;
import com.bummon.adapter.object.Adapter;

/**
 * @author Bummon
 * @description 目标 博客地址：http://blog.bummon.com/blog/4123342314.html
 * @date 2023-08-14 16:31
 */
public class Target extends Adaptee implements Adapter {

    @Override
    public String lighting() {
        String socket = this.typeC();
        System.out.println("将耳机插上lighting转换口");
        socket = "lighting";
        return socket;
    }
}
