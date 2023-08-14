package com.bummon.adapter.object;

/**
 * @author Bummon
 * @description 目标  博客地址：http://blog.bummon.com/blog/4123342314.html
 * @date 2023-08-14 16:44
 */
public class Target implements Adapter {

    private Adaptee adaptee;

    public Target(Adaptee adaptee) {
        this.adaptee = adaptee;
    }


    @Override
    public String lighting() {
        String typeC = this.adaptee.typeC();
        System.out.println("将耳机插上lighting转换口");
        typeC = "lighting";
        return typeC;
    }
}
