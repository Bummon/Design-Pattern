package com.bummon.decorator;

import lombok.Data;

/**
 * @author Bummon
 * @description 用户对象 博客地址：http://blog.bummon.com/blog/2614702854.html
 * @date 2023-08-14 17:05
 */
@Data
public class User {
    /**
     * 姓名
     */
    private String name;

    /**
     * 用户类型
     */
    private String type;
}
