package com.bummon.proxy.simple;

import com.bummon.proxy.simple.proxy.Proxy;

/**
 * @author Bummon
 * @description 代理模式 博客地址：http://blog.bummon.com/blog/2068909584.html
 * @date 2023-08-14 17:41
 */
public class Client {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
    }

}
