package com.bummon.iterator;

import lombok.Data;

/**
 * @author Bummon
 * @description 博客地址：http://blog.bummon.com/blog/2421543447.html
 * @date 2023-08-15 10:34
 */
@Data
public class Patient {

    /**
     * 病人姓名
     */
    private String name;

    /**
     * 挂号号码
     */
    private Integer num;

    public Patient(String name, Integer num) {
        this.name = name;
        this.num = num;
    }

    public void diagnosis() {
        System.out.println("医生你好，我是第" + this.num + "号病人" + this.name);
    }

}
