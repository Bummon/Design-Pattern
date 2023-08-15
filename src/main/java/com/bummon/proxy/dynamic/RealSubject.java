package com.bummon.proxy.dynamic;

/**
 * @author Bummon
 * @description 真实主题角色 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-15 14:26
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject：请求处理中...");
    }
}
