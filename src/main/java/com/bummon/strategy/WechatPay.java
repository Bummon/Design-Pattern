package com.bummon.strategy;

/**
 * @author Bummon
 * @description 具体策略角色 博客地址：http://blog.bummon.com/blog/1927526001.html
 * @date 2023-08-15 10:18
 */
public class WechatPay implements Pay {
    @Override
    public void pay() {
        System.out.println("使用微信支付");
    }
}
