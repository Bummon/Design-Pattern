package com.bummon.decorator;

/**
 * @author Bummon
 * @description SSO实例对象 博客地址：http://blog.bummon.com/blog/2614702854.html
 * @date 2023-08-14 17:23
 */
public class SSOImpl implements SSO {
    @Override
    public boolean verify() {
        return true;
    }
}
