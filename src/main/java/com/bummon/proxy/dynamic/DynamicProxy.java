package com.bummon.proxy.dynamic;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @author Bummon
 * @description 动态代理角色 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-15 14:27
 */
public class DynamicProxy implements InvocationHandler {
    private Object realObject;

    public DynamicProxy(Object realObject) {
        this.realObject = realObject;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用前执行
        System.out.println("DynamicProxy: 请求后执行逻辑");

        // 执行实际方法
        Object result = method.invoke(realObject, args);

        // 调用后执行
        System.out.println("DynamicProxy: 请求后执行逻辑");

        return result;
    }
}
