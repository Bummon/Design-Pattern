package com.bummon.decorator;

import org.springframework.stereotype.Service;

/**
 * @author Bummon
 * @description token管理 博客地址：http://blog.bummon.com/blog/2614702854.html
 * @date 2023-08-14 17:11
 */
public class TokenService {

    /**
     * @return {@link User}
     * @date 2023-08-14 17:14
     * @author Bummon
     * @description 从token中获取用户 这里为了演示直接新建对象
     */
    public User getUser() {
        User user = new User();
        user.setName("张三");
        user.setType("admin");
        return user;
    }
}
