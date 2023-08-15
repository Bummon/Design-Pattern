package com.bummon.proxy.dynamic;


import org.springframework.cglib.proxy.Proxy;

/**
 * @author Bummon
 * @description 代理模式-动态代理 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-15 14:28
 */
public class Client {

    public static void main(String[] args) {
        // 创建被代理对象
        RealSubject realSubject = new RealSubject();

        // 创建代理对象
        Subject proxy = (Subject) Proxy.newProxyInstance(
                realSubject.getClass().getClassLoader(),
                realSubject.getClass().getInterfaces(),
                new DynamicProxy(realSubject)
        );

        // 调用代理对象的方法
        proxy.request();
    }

}
