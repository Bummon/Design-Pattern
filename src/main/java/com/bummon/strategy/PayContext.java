package com.bummon.strategy;

/**
 * @author Bummon
 * @description 上下文角色 博客地址：http://blog.bummon.com/blog/1927526001.html
 * @date 2023-08-15 10:19
 */
public class PayContext {

    private final Pay pay;


    public PayContext(Pay pay) {
        this.pay = pay;
    }

    public void payment() {
        pay.pay();
    }

}
