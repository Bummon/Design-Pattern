package com.bummon.proxy.simple.proxy;

import com.bummon.proxy.simple.subject.impl.RealSubject;

import java.util.Objects;

/**
 * @author Bummon
 * @description 代理角色 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-14 17:32
 */
public class Proxy {

    private RealSubject realSubject;

    public void request() {
        if (Objects.isNull(realSubject)) {
            realSubject = new RealSubject();
        }
        this.preRequest();
        realSubject.request();
        this.postRequest();
    }

    private void preRequest() {
        System.out.println("Proxy: 请求前执行逻辑");
    }

    private void postRequest() {
        System.out.println("Proxy: 请求后执行逻辑");
    }

}
