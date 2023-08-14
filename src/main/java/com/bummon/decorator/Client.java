package com.bummon.decorator;

import org.springframework.context.ApplicationContext;

import javax.annotation.Resource;

/**
 * @author Bummon
 * @description 装饰器模式 博客地址：http://blog.bummon.com/blog/2614702854.html
 * @date 2023-08-14 17:15
 */
public class Client {

    public static void main(String[] args) {
        ConcreteDecorator decorator = new ConcreteDecorator(new SSOImpl());
        if (decorator.verify()) {
            if (decorator.limit()) {
                System.out.println("执行原有方法");
            } else {
                System.out.println("无权限执行方法");
            }
        } else {
            System.out.println("权限认证失败");
        }
    }

}
