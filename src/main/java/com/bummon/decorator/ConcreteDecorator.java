package com.bummon.decorator;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Bummon
 * @description 具体装饰器 博客地址：http://blog.bummon.com/blog/2614702854.html
 * @date 2023-08-14 17:02
 */
public class ConcreteDecorator implements Decorator {

    private TokenService tokenService = new TokenService();

    private SSO sso;

    public ConcreteDecorator(SSO sso) {
        this.sso = sso;
    }

    /**
     * @return {@link boolean}
     * @date 2023-08-14 17:14
     * @author Bummon
     * @description 实现限制权限的方法
     */
    @Override
    public boolean limit() {
        //获取用户信息
        User user = tokenService.getUser();
        //判断用户是否为管理员
        if ("admin".equals(user.getType())) {
            System.out.println(user.getName() + "为管理员");
            return true;
        } else {
            System.out.println(user.getName() + "不是管理员");
            return false;
        }
    }

    /**
     * @param
     * @return {@link boolean}
     * @date 2023-08-14 17:14
     * @author Bummon
     * @description 实现SSO中原有的校验方法
     */
    @Override
    public boolean verify() {
        return sso.verify();
    }
}
